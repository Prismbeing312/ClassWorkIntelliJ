package players;

import java.util.function.Predicate;

public class CheckAlive implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 50;
    }
}
