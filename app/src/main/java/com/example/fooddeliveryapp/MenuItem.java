package com.example.fooddeliveryapp;

public class MenuItem
{
    private int id;
    private String foodName;
    private String foodDescription;
    private String foodPrice;
    private final int foodImg;
    private int num;
    private boolean special;

    public MenuItem(int id, String foodName, String foodDescription, String foodPrice, int foodImg, int inNum, boolean special)
    {
        this.id = id;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodImg = foodImg;
        this.num = inNum;
        this.special = special;
    }

    public void incrementNum()
    {
        num++;
    }

    public void decreaseNum()
    {
        num--;
    }

    public String getFoodName() {return foodName; }
    public int getFoodImg() {return foodImg; }
    public String getFoodDescription() {return foodDescription; }
    public String getFoodPrice() {return foodPrice; }
    public String getNum() {return Integer.toString(num); }
    public boolean getSpecial() {return special;}
    public int getNumItems() {return num;}
    public void setSpecial(){this.special = true;}
    public void setPrice(String inPrice){this.foodPrice = inPrice;}
    public void setId(int id) {this.id=id;}
    public int getId() {return id;}

}
