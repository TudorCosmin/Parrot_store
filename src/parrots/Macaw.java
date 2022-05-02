package parrots;

import java.util.List;

import static parrots.Requirements.*;

public class Macaw extends Parrot {
    public Macaw() {
        super("Macaw Parrot",
                List.of(Big_cage,
                        Fresh_water,
                        Parrot_partner),
                64.99);
    }
}
