package com.example.fooddeliveryapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentCheckout extends Fragment {

    private TextView checkoutTag;

    public FragmentCheckout() {
        // Required empty public constructor
    }

    public static FragmentCheckout newInstance(String param1, String param2) {
        FragmentCheckout fragment = new FragmentCheckout();
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
        View view = inflater.inflate(R.layout.fragment_checkout, container, false);

        checkoutTag = (TextView) view.findViewById(R.id.checkoutTag);

        return view;
    }
}