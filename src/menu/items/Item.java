package menu.items;

public interface Item {
    void displayInformation(Integer index);

    String getDisplayName();

    double getPrice();
}
