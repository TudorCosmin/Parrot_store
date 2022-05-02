package menu;

import food.Food;
import menu.items.Item;
import parrots.Parrot;
import utils.ItemUtils;

import java.util.List;

public class Meniu {
    private List<Parrot> parrotList;
    private List<Food> foodList;

    public void displayOptions() {
        System.out.println("1. Parots");
        System.out.println("2. Parrot food");
    }

    public void displayOptions(int menuIndex) {
        ItemUtils.displayItems(getMenuItems(menuIndex));
    }

    private List<? extends Item> getMenuItems(int menuIndex) {
        return switch (menuIndex) {
            case 1 -> parrotList;
            case 2 -> foodList;
            default -> null;
        };
    }

    public Item getOrderItem(int menuIndex, int itemsIndex) {
        return getMenuItems(menuIndex).get(itemsIndex - 1);
    }

    public void setParrotItems (List<Parrot> parrot_list) {
        this.parrotList = parrot_list;
    }

    public void setFoodItems (List<Food> food_list) {
        this.foodList = food_list;
    }
}
