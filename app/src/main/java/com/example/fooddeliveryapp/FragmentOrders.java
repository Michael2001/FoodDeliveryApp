package com.example.fooddeliveryapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;


public class FragmentOrders extends Fragment {

    public int image;
    public String userEmail;
    private List<MenuItem> menuList;
    Order order;
    User user;


    public FragmentOrders(Order inOrder) {
        this.user = user;
        userEmail = inOrder.getUseremail();
        image = inOrder.getPersonImg();
        menuList = inOrder.getOrderedItems();
        this.order = inOrder;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.template_menu, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.menuRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new AdapterOrder(menuList));

        return view;
    }
}