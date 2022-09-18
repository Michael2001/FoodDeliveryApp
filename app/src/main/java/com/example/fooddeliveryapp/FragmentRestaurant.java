package com.example.fooddeliveryapp;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class FragmentRestaurant extends Fragment {

    public int image;
    public String name;
    private List<MenuItem> menuList;
    RecyclerView recyclerView;


    public FragmentRestaurant(Restaurant restaurant) {
        name = restaurant.getName();
        image = restaurant.getImgUrl();
        menuList = restaurant.getMenuList();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.template_menu, container, false);

//        TextView restaurantName = (TextView) view.findViewById(R.id.restaurantName);
//        ImageView restaurantImg = (ImageView) view.findViewById(R.id.restaurantImage);
        RecyclerView recyclerView = view.findViewById(R.id.menuRecyclerView);

//        restaurantName.setText(name);
//        restaurantImg.setImageResource(image);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new AdaptorMenuItem(menuList));

        return view;
    }
}