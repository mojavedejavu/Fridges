package com.xfang.www.fridges.dummy;

import com.xfang.www.fridges.model.FoodItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    public static final List<FoodItem> ITEMS = new ArrayList<>();
    public static final Map<Integer, FoodItem> ITEM_MAP = new HashMap<>();


    private static final int COUNT = 20;

    private static final String[] TEST_NAME_ARRAY = {
            "Radish", "Kale", "Carrots", "Tomatoes", "Broccoli",
            "Bell Peppers", "Cucumber", "Zucchini", "Pumpkin", "Eggplant",
            "Squash", "Celery", "Potatoes", "Cabbage", "Onions",
            "Cherries", "Strawberries", "Apples", "Kiwis", "Avocados"};
    private static Random rand = new Random();

    static {
        for (int i = 0; i < COUNT; i++) {
            int category;
            if (i < 15){
                category = FoodItem.CATEGORY_VEGETABLES;
            }
            else{
                category = FoodItem.CATEGORY_FRUITS;
            }
            FoodItem food = new FoodItem(i, TEST_NAME_ARRAY[i], category, rand.nextInt(FoodItem.STATUS_TYPES));
            addItem(food);
        }
    }

    private static void addItem(FoodItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.itemId, item);
    }

}
