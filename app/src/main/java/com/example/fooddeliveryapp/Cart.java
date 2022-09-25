package com.example.fooddeliveryapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    //Contains a list of food items,
    private List<MenuItem> cartList;

    public Cart()
    {
        cartList = new ArrayList<>();
        RestaurantStructure structure = RestaurantStructure.get();
        for (int ii = 0; ii < structure.size()-1; ii++)
        {
            Restaurant temp = structure.get(ii);
            for (int yy =0; yy <= temp.getNumItems()-1; yy++){
                MenuItem tempItem = temp.getMenuList().get(yy);
                if (tempItem.getNumItems()>0)
                {
                    cartList.add(temp.getMenuList().get(yy));
                }
            }
        }
    }

    public List<MenuItem> getCartItems() {return cartList;}
}
