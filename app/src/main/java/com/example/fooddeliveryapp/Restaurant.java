package com.example.fooddeliveryapp;

import java.util.List;

public class Restaurant {

    private String name;
    private final int imgUrl;
    private List<MenuItem> menuList;

    public Restaurant(String name, int imgUrl) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.menuList = null;
    }

    public Restaurant (Restaurant inRes)
    {
        this.name = inRes.getName();
        this.imgUrl = inRes.getImgUrl();
        this.menuList = inRes.getMenuList();
    }

    public Restaurant(String name, int imgUrl, List<MenuItem> menuList) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.menuList = menuList;
    }

    public String getName() {return name;}
    public int getNumItems(){return menuList.size();}
    public int getImgUrl() {return imgUrl;}
    public List<MenuItem> getMenuList() {return menuList;}

    public void incrementItem(String item)
    {
        for (int yy =0; yy < menuList.size(); yy++){
            MenuItem tempItem = menuList.get(yy);
            if (tempItem.getFoodName().equals(item)){
                tempItem.incrementNum();
            }
        }
    }
}
