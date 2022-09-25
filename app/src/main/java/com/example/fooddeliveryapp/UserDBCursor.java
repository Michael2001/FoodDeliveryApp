package com.example.fooddeliveryapp;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.example.fooddeliveryapp.UserDBSchema.userTable;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

public class UserDBCursor extends CursorWrapper {
    public UserDBCursor(Cursor cursor) {
        super(cursor);
    }

    public User getUser()
    {
        User user = new User();

        String id = String.valueOf(getInt(getColumnIndex(userTable.Cols.COL_USER_ID)));
        String email = getString(getColumnIndex(userTable.Cols.COL_USER_EMAIL));
        String password = getString(getColumnIndex(userTable.Cols.COL_USER_PASSWORD));
        String ordersSerialized = getString(getColumnIndex((userTable.Cols.COL_USER_ORDERS)));
        OrderStructure orders = stringToObj(ordersSerialized);

        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setOrders(orders);
        return user;
    }

    private OrderStructure stringToObj( String s ) {
        try {
            byte [] Byte_Data = Base64.getDecoder().decode( s );
            ObjectInputStream ois = new ObjectInputStream( new ByteArrayInputStream(Byte_Data) );
            OrderStructure orderStructure = (OrderStructure) ois.readObject();
            ois.close();
            return orderStructure;
        } catch(IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
