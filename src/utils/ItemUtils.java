package utils;

import menu.Item;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ItemUtils {
    private ItemUtils() {}

    public static void displayItems(List<? extends Item> items) {
        for (int index = 0; index < items.size(); index++) {
            System.out.println(items.get(index).displayInformation(index + 1));
        }
    }

    public static void displayItemsFile(List<? extends Item> items, String path) {
        FileWriter filew = null;
        try { // (FileWriter filew = new FileWriter(path, true)) {
            filew = new FileWriter(path, true);

            for (int index = 0; index < items.size(); index++)
                    filew.append(items.get(index).displayInformation(index + 1));
            filew.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayStringFile(List<String> items, String path) {
        FileWriter filew = null;
        try {
            filew = new FileWriter(path, true);

            for (String item : items)
                filew.append("\n").append(item);
            filew.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayIntFile(double item, String path) {
        FileWriter filew = null;
        try {
            filew = new FileWriter(path, true);
            filew.append("\n\nTotal price: ");
            filew.append(String.valueOf(item));
            filew.append("$\n");
            filew.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
