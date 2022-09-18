package com.example.fooddeliveryapp;

import java.util.Arrays;
import java.util.List;

public class RestaurantStructure {
    private List<Restaurant> restaurantList = Arrays.asList(new Restaurant[] {
            new Restaurant("Jill's Catering", R.drawable.restaurant001, null),
            new Restaurant("Burgers are Us", R.drawable.restaurant002, null),
            new Restaurant("John's Italian", R.drawable.restaurant003, null),
            new Restaurant("Steak and Wine House", R.drawable.restaurant004, null),
            new Restaurant("Rondo Lunch Bar", R.drawable.restaurant005, null),
            new Restaurant("Fresh Farms Produce", R.drawable.restaurant006, null),
            new Restaurant("Soup House", R.drawable.restaurant007, null),
            new Restaurant("JCA Noodle Bar", R.drawable.restaurant008, null),
            new Restaurant("Jim's Fish and Chips", R.drawable.restaurant009, null),
            new Restaurant("Su Sushi", R.drawable.restaurant010, null),
            new Restaurant("Dumping Dons", R.drawable.restaurant011, null),
            new Restaurant("Desert Central", R.drawable.restaurant012, null),
    });


    private static RestaurantStructure instance = null;

    public static RestaurantStructure get()
    {
        if(instance == null)
        {
            instance = new RestaurantStructure();
        }
        return instance;
    }

    protected RestaurantStructure() {};

    public Restaurant get(int i) { return restaurantList.get(i); }

    public int size() { return restaurantList.size(); }

    public void add(Restaurant restaurant) { restaurantList.add(0, restaurant); }

    public void remove(int i) { restaurantList.remove((i)); }
}
