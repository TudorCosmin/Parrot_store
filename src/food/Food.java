package food;

import menu.Item;

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
    public String displayInformation(Integer index) {
        return index + ". " + name + " - " + price + "$\n" + ingredients + "\n";
//        System.out.printf("%s. %s - %s$ \n", index, name, price);
//        System.out.println(ingredients);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
