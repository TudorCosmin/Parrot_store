package food;

import menu.items.Item;

public class Food implements Item {

    @Override
    public void displayInformation(Integer index) {
        System.out.printf("%s. informatii despre un tip de mancare \n", index);
    }

    @Override
    public String getDisplayName() {
        return "asd";
    }

    @Override
    public double getPrice() {
        return 0;
    }

}
