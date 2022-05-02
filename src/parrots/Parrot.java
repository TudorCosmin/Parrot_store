package parrots;

import menu.Item;

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
        System.out.printf("%s. %s - %s$ \n", index, name, price);
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    public List<Requirements> getRequirements() { return requirements; }
}
