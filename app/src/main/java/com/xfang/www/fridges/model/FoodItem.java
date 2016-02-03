package com.xfang.www.fridges.model;

public class FoodItem {

    public static final int CATEGORY_VEGETABLES = 0;
    public static final int CATEGORY_FRUITS = 1;
    public static final int CATEGORY_DAIRY = 2;
    public static final int CATEGORY_MEAT = 3;

    public static final int STATUS_FUCK_TON = 0;
    public static final int STATUS_ALMOST_OUT = 1;
    public static final int STATUS_OUT = 2;


    public final int itemId;
    public final String name;
    public final int category;
    public final int status;

    public FoodItem(int itemId, String name, int category, int status) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.status = status;
    }


    @Override
    public String toString() {
        return itemId + " " +
                name + " " +
                category + " " +
                status;
    }
}