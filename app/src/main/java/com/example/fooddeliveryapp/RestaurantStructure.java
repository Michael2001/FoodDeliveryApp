package com.example.fooddeliveryapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestaurantStructure {
    private List<Restaurant> restaurantList = Arrays.asList(new Restaurant[] {
            new Restaurant("Jill's Catering", R.drawable.restaurant001, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "12 pack of delicious beef, chicken, mustard and our speical dressing", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Tomato and Chess Sandwich", "12 pack of delicious tomato, cheese, mustard and our speical dressing", "$25.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "12 pack of delicious beef, chicken, mustard and our speical dressing", "$25.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Burgers are Us", R.drawable.restaurant002, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("John's Italian", R.drawable.restaurant003, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Steak and Wine House", R.drawable.restaurant004, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Rondo Lunch Bar", R.drawable.restaurant005, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Fresh Farms Produce", R.drawable.restaurant006, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Soup House", R.drawable.restaurant007, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("JCA Noodle Bar", R.drawable.restaurant008, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Jim's Fish and Chips", R.drawable.restaurant009, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Su Sushi", R.drawable.restaurant010, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Dumping Dons", R.drawable.restaurant011, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
            new Restaurant("Desert Central", R.drawable.restaurant012, Arrays.asList(new MenuItem[] {
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001),
                    new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001)
            })),
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

