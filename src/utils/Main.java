package utils;

public class Main {

    public static void main(String[] args) {
        ParrotStore parrotStore = new ParrotStore();

        if (parrotStore.welcome() == 1) {
            parrotStore.placeOrder();
            parrotStore.finishOrder();
        }
        else parrotStore.playWithCarlos();
    }
}
