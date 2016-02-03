package com.xfang.www.fridges.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.xfang.www.fridges.data.FridgesContract.FoodEntry;

public class FridgesDbHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "fridges.db";

    public FridgesDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_FOOD_TABLE = "CREATE TABLE " + FoodEntry.TABLE_NAME +
                " (" +
                FoodEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                FoodEntry.COLUMN_ITEM_ID + " INTEGER AUTOINCREMENT NOT NULL, " +
                FoodEntry.COLUMN_NAME + " TEXT NOT NULL, " +
                FoodEntry.COLUMN_CATEGORY + " INTEGER NOT NULL, " +
                FoodEntry.COLUMN_STATUS + " INTEGER NOT NULL, " +
                ");";

        db.execSQL(SQL_CREATE_FOOD_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + FoodEntry.TABLE_NAME);
        onCreate(db);
    }

}
