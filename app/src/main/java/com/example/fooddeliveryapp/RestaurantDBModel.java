package com.example.fooddeliveryapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.fooddeliveryapp.RestaurantDBSchema.restaurantTable;
import java.util.ArrayList;

public class RestaurantDBModel {
    SQLiteDatabase db;

    public void load(Context context){
        this.db = new RestaurantDBHelper(context).getWritableDatabase();
    }

    public void addRestaurant(Restaurant restaurant) {

    }

    public ArrayList<Restaurant> getAllRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
        Cursor cursor = db.query(RestaurantDBSchema.restaurantTable.NAME, null, null, null, null, null, null);
        RestaurantDBCursor restaurantDBCursor = new RestaurantDBCursor(cursor);

        try {
            restaurantDBCursor.moveToFirst();
            while(!restaurantDBCursor.isAfterLast()) {
                restaurants.add(restaurantDBCursor.getRestaurant());
                restaurantDBCursor.moveToNext();
            }
        } finally {
            cursor.close();
        }
        return restaurants;
    }
}
