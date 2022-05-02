package menu;

import food.Food;
import food.FruitMix1;
import food.FruitMix2;
import parrots.Macaw;
import parrots.Parrot;
import parrots.Quaker;
import parrots.Senegal;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MenuBuilder {
    private MenuBuilder() {

    }

    public static Meniu build() {
        Meniu menu = new Meniu();

        menu.setParrotItems(createParrotItems());
        menu.setFoodItems(createFoodItems());

        return menu;
    }

    private static List<Parrot> createParrotItems() {
        List<Parrot> parrotItems = new ArrayList<>();

        parrotItems.add(new Macaw());
        parrotItems.add(new Quaker());
        parrotItems.add(new Senegal());

        return parrotItems;
    }

    private static List<Food> createFoodItems() {
        List<Food> foodItems = new ArrayList<>();

        foodItems.add(new FruitMix1());
        foodItems.add(new FruitMix2());

        return foodItems;
    }
}
