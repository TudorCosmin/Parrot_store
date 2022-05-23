package food;

import java.util.List;

import static food.Ingredients.*;

public class VegetableMix1 extends Food {
    public VegetableMix1() {
        super("VegetableMix1 for cool parrots",
                List.of(Hot_peppers,
                        Collard_greens,
                        Courgettes,
                        Mustard_greens,
                        Spinach,
                        Carrots,
                        Tomatoes),
                20.0);
    }
}
