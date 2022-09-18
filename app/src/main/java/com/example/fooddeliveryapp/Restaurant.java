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

    public Restaurant(String name, int imgUrl, List<MenuItem> menuList) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.menuList = menuList;
    }

    public String getName() {return name;}
    public int getImgUrl() {return imgUrl;}
    public List<MenuItem> getMenuList() {return menuList;}

}
