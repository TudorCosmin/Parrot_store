package parrots;

import menu.items.Item;

import java.util.List;

public class Parrot implements Item {
    private final String name;
    private final List<Requirements> requirements;
    private final Double price;

    public Parrot(String name, List<Requirements> requirements, Double price) {
        this.name = name;
        this.requirements = requirements;
        this.price = price;
    }


    @Override
    public void displayInformation(Integer index) {
        System.out.printf("%s. %s \n", index, name);
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
