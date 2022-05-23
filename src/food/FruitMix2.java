package food;

import java.util.List;

import static food.Ingredients.*;

public class FruitMix2 extends Food {
    public FruitMix2() {
        super("FruitMix2 for strong parrots",
                List.of(Apples,
                        Bananas,
                        Citrus_fruits,
                        Pomegranate,
                        Peaches),
                15.0);
    }
}
