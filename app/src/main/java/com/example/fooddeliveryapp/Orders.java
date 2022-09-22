package com.example.fooddeliveryapp;

import java.util.List;

public class Orders {

    //List of menu items that have been added
    private List<MenuItem> menuList;


    public Orders(String name, int imgUrl) {
        this.menuList = null;
    }

    public void add (MenuItem inItem){
        menuList.add(inItem);
    }
}
