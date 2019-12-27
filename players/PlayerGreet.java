package players;

import java.util.function.Function;

public class PlayerGreet implements Function<String, String> {


    @Override
    public String apply(String name) {
        return "I am a Player and my name is " + name;
    }
}
