package players;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PlayerAttack implements BiConsumer<String, Integer> {

    @Override
    public void accept(String s, Integer integer) {
        System.out.printf("%s and i am %d I am a player!!! \n", s, integer);
    }
}