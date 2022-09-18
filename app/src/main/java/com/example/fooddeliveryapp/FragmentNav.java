package com.example.fooddeliveryapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class FragmentNav extends Fragment {

    private Button navSpecials;
    private Button navRestaurants;
    private Button navCheckout;
    private Button navOrders;


    public FragmentNav() {}

    public static FragmentNav newInstance() {
        return new FragmentNav();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav, container, false);

        navSpecials = (Button) view.findViewById(R.id.nav_specials);
        navRestaurants = (Button) view.findViewById(R.id.nav_restaurants);
        navCheckout = (Button) view.findViewById(R.id.nav_checkout);
        navOrders = (Button) view.findViewById(R.id.nav_orders);

        return view;
    }
}