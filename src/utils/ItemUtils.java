package utils;

import menu.items.Item;

import java.util.List;

public class ItemUtils {
    private ItemUtils() {}

    public static void displayItems(List<? extends Item> items) {
        for (int index = 0; index < items.size(); index++) {
            items.get(index).displayInformation(index + 1);
        }
    }
}
