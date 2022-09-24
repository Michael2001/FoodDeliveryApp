package com.example.fooddeliveryapp;

import android.util.Log;

import java.util.List;

public class Order {
    private String useremail;
    private String time;
    private List<MenuItem> orderedItems;

    public Order(String name, String inTime, List<MenuItem> inMenuList) {
        this.useremail = name;
        this.time = inTime;
        this.orderedItems = inMenuList;
    }

    public String getUseremail() {return useremail;}
    public List<MenuItem> getOrderedItems() {return orderedItems;}
    public int getPersonImg() {return R.drawable.personimage; }
    public String getOrderDate() {return time;}

    public String returnPrice(){
        int total = 0;
        for (int ii = 0; ii< orderedItems.size()-1; ii++){
            Log.i("Price",orderedItems.get(ii).getFoodPrice().substring(1,3));
            total += Integer.parseInt(orderedItems.get(ii).getFoodPrice().substring(1,2));
        }
        Log.i("Price",Integer.toString(total));
        return Integer.toString(total);
    }






}
