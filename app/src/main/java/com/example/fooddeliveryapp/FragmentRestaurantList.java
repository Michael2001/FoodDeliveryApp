package com.example.fooddeliveryapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FragmentRestaurantList extends Fragment {

    private TextView restuaurantTag;

    public FragmentRestaurantList() {
        // Required empty public constructor
    }

    public static FragmentRestaurantList newInstance(String param1, String param2) {
        FragmentRestaurantList fragment = new FragmentRestaurantList();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurant_list, container, false);

        restuaurantTag = (TextView) getView().findViewById(R.id.restuaurantTag);
        return view;
    }
}