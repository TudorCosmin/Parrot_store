package food;

import java.util.List;

import static food.Ingredients.*;

public class FruitMix1 extends Food {
    public FruitMix1() {
        super("Colorful fruit mix",
                List.of(Grapes,
                        Mango,
                        Papaya,
                        Passion_fruit,
                        Pomegranate),
                10.0);
    }
}
