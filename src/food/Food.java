package food;

import menu.items.Item;
import parrots.Requirements;

import java.util.List;

public class Food implements Item {
    private final String name;
    private final List<Ingredients> ingredients;
    private final Double price;

    public Food(String name, List<Ingredients> ingredients, Double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }


    @Override
    public void displayInformation(Integer index) {
        System.out.printf("%s. %s \n", index, name);
        System.out.println(ingredients);
    }

    @Override
    public String getDisplayName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
