package com.example.fooddeliveryapp;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.example.fooddeliveryapp.UserDBSchema.userTable;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;
import java.util.List;

public class RestaurantDBCursor extends CursorWrapper {
    public RestaurantDBCursor(Cursor cursor) {
        super(cursor);
    }

    public Restaurant getRestaurant()
    {
        String name = String.valueOf(getInt(getColumnIndex(userTable.Cols.COL_USER_ID)));
        String imgSource = getString(getColumnIndex(userTable.Cols.COL_USER_EMAIL));
        String itemsSerialized = getString(getColumnIndex(userTable.Cols.COL_USER_PASSWORD));

        List<MenuItem> menuList = stringToObj(itemsSerialized);

        Restaurant restaurant = new Restaurant(name, Integer.valueOf(imgSource), menuList);

        return restaurant;
    }

    private List<MenuItem> stringToObj(String s ) {
        try {
            byte [] Byte_Data = Base64.getDecoder().decode( s );
            ObjectInputStream ois = new ObjectInputStream( new ByteArrayInputStream(Byte_Data) );
            List<MenuItem> menuItemList = (List<MenuItem>) ois.readObject();
            ois.close();
            return menuItemList;
        } catch(IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
