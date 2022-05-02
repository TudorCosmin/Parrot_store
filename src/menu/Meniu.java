package menu;

import food.Food;
import parrots.Parrot;
import toys.Toy;
import utils.ItemUtils;

import java.util.List;

public class Meniu {
    private List<Parrot> parrotList;
    private List<Food> foodList;
    private List<Toy> toyList;

    public void displayOptions() {
        System.out.println("1. Parots");
        System.out.println("2. Food");
        System.out.println("3. Toys");
    }

    public void displayOptions(int menuIndex) {
        ItemUtils.displayItems(getMenuItems(menuIndex));
    }

    private List<? extends Item> getMenuItems(int menuIndex) {
        return switch (menuIndex) {
            case 1 -> parrotList;
            case 2 -> foodList;
            case 3 -> toyList;
            default -> null;
        };
    }

    public Item getOrderItem(int menuIndex, int itemsIndex) {
        return getMenuItems(menuIndex).get(itemsIndex - 1);
    }

    public void setParrotItems (List<Parrot> parrotList) { this.parrotList = parrotList; }

    public void setFoodItems (List<Food> foodList) { this.foodList = foodList; }

    public void setToyItems (List<Toy> toyList) { this.toyList = toyList; }
}
