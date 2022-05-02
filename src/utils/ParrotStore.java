package utils;

import menu.Meniu;
import menu.MenuBuilder;
import menu.items.Item;
import utils.ItemUtils;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParrotStore {
    private final Meniu menu;
    private final Scanner scanner;
    private final List<Item> order;

    public ParrotStore() {
        menu = MenuBuilder.build();
        scanner = new Scanner(System.in);
        order = new ArrayList<>();
    }

    public void welcome() {
        System.out.println("welcome");
    }

    public void placeOrder() {
        displayOptions();

        int customerInput = getCustomerInput("Does something fancy your eyes?");

        if (customerInput != 0) {
            placeOrder(customerInput);
        }
    }

    public void placeOrder(int menuIndex) {
        displayOptions(menuIndex);

        int customerInput = getCustomerInput("What would you like to order something?");

        while (customerInput != 0) {
            addOrderItem(menu.getOrderItem(menuIndex, customerInput));

            customerInput = getCustomerInput("Would you like to order something else from these options?");
        }

        placeOrder();
    }

    private void displayOptions() {
        System.out.println();
        menu.displayOptions();
        System.out.println("0. Place Order");
    }

    private void displayOptions(int menuIndex) {
        System.out.println();
        menu.displayOptions(menuIndex);
        System.out.println("0. Back");
    }

    public void finishOrder() {
        if (order.isEmpty()) {
            System.out.println("Thank you for passing by!");
        } else {
            System.out.println("Thank you for your order!");
            System.out.println();

            System.out.println("Order items: ");
            ItemUtils.displayItems(order);
//            System.out.println("Total price: " + totalPrice() + "$ (discount applied)");
        }
    }

    private int getCustomerInput(String displayMessage) {
        System.out.printf("%s ", displayMessage);
        return scanner.nextInt();
    }

    public void addOrderItem(Item item) {
        order.add(item);

        System.out.printf("%s was added to your basket.", item.getDisplayName());
        System.out.println();
    }

}
