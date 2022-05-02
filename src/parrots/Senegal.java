package parrots;

import java.util.List;

import static parrots.Requirements.*;

public class Senegal extends Parrot {
    public Senegal() {
        super("Senegal Parrot",
                List.of(Big_cage,
                        Parrot_partner,
                        Toys,
                        Fresh_water,
                        Lots_of_attention),
                79.99);
    }
}
