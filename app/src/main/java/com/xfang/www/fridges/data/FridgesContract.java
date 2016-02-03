package com.xfang.www.fridges.data;


import android.provider.BaseColumns;

public class FridgesContract {
    public static final class FoodEntry implements BaseColumns{
        public static final String TABLE_NAME = "food";

        public static final String COLUMN_ITEM_ID = "item_id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_CATEGORY = "category";
        public static final String COLUMN_STATUS = "status";
    }
}
