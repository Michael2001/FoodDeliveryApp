package com.example.fooddeliveryapp;

public class Restaurant {

    private String name;
    private final int imgUrl;
    private Menu menu;

    public Restaurant(String name) {
        this.name = name;
        this.imgUrl = 0;
        this.menu = null;
    }

    public Restaurant(String name, int imgUrl, Menu menu) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.menu = menu;
    }

    public String getName() {return name;}
    public int getImgUrl() {return imgUrl;}
    public Menu getMenu() {return menu;}

}
