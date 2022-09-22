package com.example.fooddeliveryapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Specials {

    //Contains a list of food items,
    private List<MenuItem> specialList;

    public Specials()
    {
        specialList = new ArrayList<>();
        RestaurantStructure structure = RestaurantStructure.get();
        for (int ii = 0; ii < structure.size()-1; ii++)
        {
            Restaurant temp = structure.get(ii);
            for (int yy =0; yy <= temp.getNumItems()-1; yy++){
                MenuItem tempItem = temp.getMenuList().get(yy);
                if (tempItem.getSpecial())
                {
                    specialList.add(temp.getMenuList().get(yy));
                }
            }

        }

    }


    public List<MenuItem> getSpecialList() {return specialList;}

}
