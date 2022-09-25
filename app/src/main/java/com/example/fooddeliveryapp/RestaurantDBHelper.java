package com.example.fooddeliveryapp;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;


public class RestaurantDBHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "restaurants.db";


    private String CREATE_TABLE = "CREATE TABLE " + RestaurantDBSchema.restaurantTable.NAME + "("
            + RestaurantDBSchema.restaurantTable.Cols.COL_RES_NAME + " TEXT,"
            + RestaurantDBSchema.restaurantTable.Cols.COL_RES_IMG + " TEXT," + RestaurantDBSchema.restaurantTable.Cols.COL_RES_ITEMS + " TEXT " + ")";

    public RestaurantDBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}