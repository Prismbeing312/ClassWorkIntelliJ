package players;

import java.util.function.Function;

public class ZombieGreet implements Function<String, String> {


    @Override
    public String apply(String name) {
        return "I am a zombie and my name is " + name;
    }
}
