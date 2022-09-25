package com.example.fooddeliveryapp;

public class RestaurantDBSchema {
    public static class restaurantTable{
        public static final String NAME = "restaurants";
        public static class Cols{
            public static final String COL_RES_NAME = "restaurant_name";
            public static final String COL_RES_IMG = "restaurant_img";
            public static final String COL_RES_ITEMS = "restaurant_items";
        }
    }
}
