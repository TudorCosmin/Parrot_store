package toys;

import menu.Item;

public class Toy implements Item {
    private final String name;
    private final Double price;

    public Toy(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public void displayInformation(Integer index) {
        System.out.printf("%s. %s - %s$ \n", index, name, price);
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
