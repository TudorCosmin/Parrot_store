package utils;

import database.InitDatabase;

public class Main {

    public static void main(String[] args) {
//        Init DB with initial items and quantities (after running DatabaseConnection):
//        InitDatabase.initialization();

        ParrotStore parrotStore = new ParrotStore();

        if (parrotStore.welcome() == 1) {
            parrotStore.placeOrder();
            parrotStore.finishOrder();
        }
        else parrotStore.playWithCarlos();
    }
}
