package utils;

import menu.Meniu;
import menu.MenuBuilder;
import menu.Item;
import parrots.Parrot;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

    public int welcome() {
        System.out.println("Welcome to our store! Do you want to buy stuff or play with Carlos, our speaking parrot?");
        System.out.println("1. Buy stuff");
        System.out.println("2. Play with Carlos");
        return scanner.nextInt();
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
//            try {
                File orders_directory = new File(System.getProperty("user.dir") + "\\src\\comenzi");
                List<String> orders_files = Arrays.asList(orders_directory.list());
                int order_number = 0;
                if(!orders_files.isEmpty())
                    order_number = Integer.parseInt(orders_files.get(orders_files.size() - 1).replace("comanda", "").replace(".txt", ""));
                order_number++;

                String order_path = System.getProperty("user.dir") + "\\src\\comenzi\\comanda" + order_number + ".txt";
//                File file = new File(order_path);

//                if (file.createNewFile()) {
//                    FileWriter filew = new FileWriter(order_path, true);
//                    System.out.println(filew);
                    ItemUtils.displayItemsFile(order, order_path);
//                } else {
//                    System.out.println("File already exists.");
//                }
//            } catch (IOException e) {
//                System.out.println("An error occurred.");
//                e.printStackTrace();
//            }

            System.out.println("Thank you for your order!");
            System.out.println();

            System.out.println("Order: ");
            ItemUtils.displayItems(order);
            System.out.println("Total price: " + totalPrice() + "$\n");
            displayRequirements();
        }
    }

    private int getCustomerInput(String displayMessage) {
        System.out.printf("%s ", displayMessage);
        return scanner.nextInt();
    }

    public void addOrderItem(Item item) {
        order.add(item);

        System.out.printf("%s was added to your order.", item.getName());
        System.out.println();
    }

    private void displayRequirements() {
        int attention = 0;
        List<Parrot> orderedParrots = new ArrayList<>();

        for (Item item : order) {
            if (item instanceof Parrot) {
                if (attention == 0) {
                    System.out.println("Attention please!");
                    attention = 1;
                }
                if (!orderedParrots.contains(item)) {
                    System.out.printf("%s has the following requirements: " + ((Parrot) item).getRequirements() + "\n", item.getName());
                    orderedParrots.add((Parrot) item);
                }
            }
        }
    }

    private double totalPrice() {
        double sum = 0.0;

        for (Item item : order)
            sum += item.getPrice();

        return sum;
    }

    public void playWithCarlos() {
        System.out.println("Carlos will repeat after you. Enter your text here: ");
    }

}
