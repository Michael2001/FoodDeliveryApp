package com.example.fooddeliveryapp;

public class MenuItem
{
    private String foodName;
    private String foodDescription;
    private String foodPrice;
    private final int foodImg;

    public MenuItem(String foodName, String foodDescription, String foodPrice, int foodImg)
    {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodImg = foodImg;
    }

    public String getFoodName() {return foodName; }
    public int getFoodImg() {return foodImg; }
    public String getFoodDescription() {return foodDescription; }
    public String getFoodPrice() {return foodPrice; }
}
