package database;

public class InitDatabase {
    public static final ParrotStoreRepository repo = new ParrotStoreRepository();

    public static void initialization() {
        clear();
        create();
        add();
    }

    public static void create() {
        repo.createTables();
    }

    public static void add() {
        // initial quantities for each Item
        repo.addParrot("Macaw", 25);
        repo.addParrot("Quaker", 20);
        repo.addParrot("Senegal", 20);

        repo.addFood("FruitMix1", 30);
        repo.addFood("FruitMix2", 40);
        repo.addFood("VegetableMix1", 24);
        repo.addFood("VegetableMix2", 47);

        repo.addToy("FlyingTrapeze", 8);
        repo.addToy("HoleeRoller", 14);
        repo.addToy("WoodPlaypen", 10);
    }

    public static void clear() {
        repo.dropTables();
    }

}
