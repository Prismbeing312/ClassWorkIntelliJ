package players;

import java.util.function.BiConsumer;

public class ZombieAttack implements BiConsumer<String, Integer> {

    @Override
    public void accept(String s, Integer integer) {
        System.out.printf("%s and im %d I am a zombie!!!! \n" , s, integer);
    }
}
