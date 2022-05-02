package menu;

import food.*;
import parrots.Macaw;
import parrots.Parrot;
import parrots.Quaker;
import parrots.Senegal;
import toys.FlyingTrapeze;
import toys.HoleeRoller;
import toys.Toy;
import toys.WoodPlaypen;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MenuBuilder {
    private MenuBuilder() {}

    public static Meniu build() {
        Meniu menu = new Meniu();

        menu.setParrotItems(createParrotItems());
        menu.setFoodItems(createFoodItems());
        menu.setToyItems(createToyItems());

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
        foodItems.add(new VegetableMix1());
        foodItems.add(new VegetableMix2());

        return foodItems;
    }

    private static List<Toy> createToyItems() {
        List<Toy> toyItems = new ArrayList<>();

        toyItems.add(new HoleeRoller());
        toyItems.add(new FlyingTrapeze());
        toyItems.add(new WoodPlaypen());

        return toyItems;
    }
}
