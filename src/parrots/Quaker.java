package parrots;

import java.util.List;

import static parrots.Requirements.*;

public class Quaker extends Parrot {
    public Quaker() {
        super("Quaker Parrot",
                List.of(Small_cage,
                        Toys),
                29.99);
    }
}
