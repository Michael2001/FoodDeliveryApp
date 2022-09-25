package com.example.fooddeliveryapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FragmentUserOrders extends Fragment {

    RecyclerView recyclerView;
    public static OrderStructure dataHolder = FragmentLogin.USER.getOrders();



    public FragmentUserOrders() {
        // Required empty public constructor
    }

    public static FragmentUserOrders newInstance() {
        return new FragmentUserOrders();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view;

        if(dataHolder != null) {
            view = inflater.inflate(R.layout.fragment_orders, container, false);
            recyclerView = view.findViewById(R.id.orderRecyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
            recyclerView.setAdapter(new AdaptorOrders(dataHolder));
        } else {
            view = inflater.inflate(R.layout.fragment_no_orders, container, false);
        }

        return view;
    }

    public static OrderStructure getUserOrders() {
        if(dataHolder == null) {
            dataHolder = new OrderStructure();
            FragmentLogin.USER.setOrders(dataHolder);
        }

        return dataHolder;
    }

}