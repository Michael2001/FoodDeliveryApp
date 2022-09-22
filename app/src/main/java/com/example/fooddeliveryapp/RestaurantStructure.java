package com.example.fooddeliveryapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RestaurantStructure {
    private List<Restaurant> restaurantList;


    private static RestaurantStructure instance = null;

    public static RestaurantStructure get()
    {
        if(instance == null)
        {
            instance = new RestaurantStructure();
        }
        return instance;
    }

    protected RestaurantStructure() {
        restaurantList = Arrays.asList(new Restaurant[] {
                new Restaurant("Jill's Catering", R.drawable.restaurant001, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Classic beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Sausage Roll", "Signature Beef Sausage Roll", "$25.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef Pie", "Delicious beef pie", "$25.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Flate White", "Barrista made flat white", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Latte", "Barrista made Latte", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Ceaser Salad", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Burgers are Us", R.drawable.restaurant002, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef Burger", "Signature Grass fed beef", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Chicken Burger", "Free range chicken burger", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Small chips", "Small serving of chips", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Large chips", "Large serving of chips", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Chocolate milkshake", "Delicious chocolate milkshake", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Strawberry milkshake", "Classic Strawberry milkshake", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Cock milkshake", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("John's Italian", R.drawable.restaurant003, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Steak and Wine House", R.drawable.restaurant004, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Rondo Lunch Bar", R.drawable.restaurant005, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Fresh Farms Produce", R.drawable.restaurant006, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Soup House", R.drawable.restaurant007, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("JCA Noodle Bar", R.drawable.restaurant008, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Jim's Fish and Chips", R.drawable.restaurant009, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Su Sushi", R.drawable.restaurant010, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Dumping Dons", R.drawable.restaurant011, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Desert Central", R.drawable.restaurant012, Arrays.asList(new MenuItem[] {
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem("Beef and Chicken Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
        });
        this.createSpecials();
    };

    public Restaurant get(int i) { return restaurantList.get(i); }

    public int size() { return restaurantList.size(); }

    public void add(Restaurant restaurant) { restaurantList.add(0, restaurant); }

    public void remove(int i) { restaurantList.remove((i)); }

    //Given a restraunt name and item, find that item and call the incrament function
    public void incramentItem(String item) {
        for (int ii = 0; ii <= this.size()-1; ii++) {
            Restaurant temp = restaurantList.get(ii);
            for (int yy = 0; yy <= temp.getNumItems()-1; yy++) {
                Log.i("index", Integer.toString(yy));
                Log.i("Target", item);
                MenuItem tempItem = temp.getMenuList().get(yy);
                Log.i("Found", tempItem.getFoodName());

                if (tempItem.getFoodName().equals(item)) {
                    tempItem.incramentNum();
                    restaurantList.get(ii).getMenuList().set(yy, tempItem);
                    break;
                }
            }
        }
    }


    public void decreaseItem(String item)
    {
        for (int ii = 0; ii <= this.size()-1; ii++)
        {
            Restaurant temp = restaurantList.get(ii);
            for (int yy =0; yy <= temp.getNumItems()-1; yy++){
                Log.i("index",Integer.toString(yy));
                Log.i("Target",item);
                MenuItem tempItem = temp.getMenuList().get(yy);
                Log.i("Found",tempItem.getFoodName());

                if (tempItem.getFoodName().equals(item)) {
                    tempItem.decreaseNum();
                    restaurantList.get(ii).getMenuList().set(yy, tempItem);
                    break;
                }
            }


        }
    }

    public void createSpecials()
    {
        for (int ii = 0; ii <= this.size()-1; ii++)
        {
            Restaurant temp = restaurantList.get(ii);
            for (int yy =0; yy <= temp.getNumItems()-1; yy++){
                MenuItem tempItem = temp.getMenuList().get(yy);
                double rand = Math.random();
                if ((rand >0 ) && (rand < 0.3))
                {
                    Log.i("Rand","SetSpecial!");
                    tempItem.setSpecial();
                    String rawPrice = tempItem.getFoodPrice();
                    int price = Integer.parseInt(rawPrice.substring(1,2));
                    int discountPrice = price - (int)Math.round(price * 0.1);
                    tempItem.setPrice("$" + Integer.toString(discountPrice) + ".00");
                    restaurantList.get(ii).getMenuList().set(yy, tempItem);
                }
                else
                {
                    Log.i("Rand","No special!");
                }

            }


        }
    }

}

