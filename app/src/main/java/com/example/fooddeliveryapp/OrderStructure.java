package com.example.fooddeliveryapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderStructure implements java.io.Serializable {

    private final static long serialVersionUID = 1;

    private List<Order> orderList;
    private static OrderStructure instance = null;

    public static OrderStructure get()
    {
        if(instance == null)
        {
            instance = new OrderStructure();
        }
        return instance;
    }

    protected OrderStructure() {
        orderList = new ArrayList<Order>();
    };

    public Order get(int i) { return orderList.get(i); }

    public int size() { return orderList.size(); }

    public void add(Order inOrder)
    {
        orderList.add(orderList.size(),inOrder);
    }
}