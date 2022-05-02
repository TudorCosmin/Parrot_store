package food;

import java.util.List;

import static food.Ingredients.*;

public class FruitMix2 extends Food {
    public FruitMix2() {
        super("Strong parrot fruit mix",
                List.of(Apples,
                        Bananas,
                        Citrus_fruits,
                        Pomegranate,
                        Peaches),
                14.99);
    }
}
