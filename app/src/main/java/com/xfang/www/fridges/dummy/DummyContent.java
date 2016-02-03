package com.xfang.www.fridges.dummy;

import com.xfang.www.fridges.model.FoodItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    public static final List<FoodItem> ITEMS = new ArrayList<>();
    public static final Map<Integer, FoodItem> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    static {
        for (int i = 0; i < COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(FoodItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.itemId, item);
    }

    private static FoodItem createDummyItem(int id) {
        return new FoodItem(id, "Radish", FoodItem.CATEGORY_VEGETABLES, FoodItem.STATUS_FUCK_TON);
    }

}
