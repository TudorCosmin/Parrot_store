package food;

import java.util.List;

import static food.Ingredients.*;

public class VegetableMix2 extends Food {
    public VegetableMix2() {
        super("Playful veg mix",
                List.of(Asparagus,
                        Beets,
                        Bell_peppers,
                        Broccoli,
                        Mushrooms,
                        Butternut,
                        Carrots),
                10.0);
    }
}
