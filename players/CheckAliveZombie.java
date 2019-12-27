package players;

import java.util.function.Predicate;

public class CheckAliveZombie implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 70;
    }
}
