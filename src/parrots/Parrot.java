package parrots;

import menu.items.Item;

public class Parrot implements Item {


    @Override
    public void displayInformation(Integer index) {
        System.out.printf("%s. informatii despre un papagal \n", index);
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
