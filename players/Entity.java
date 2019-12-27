package players;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Entity {
    protected BiConsumer<String, Integer> attackStrategy;

    protected Predicate<Integer> isAlive;

    protected Function<String, String> greet;

    public Entity() {}

    public abstract void attack(String name, Integer age);

    public abstract void printIsAlive(int health);

    public abstract void greeting(String name);

    public void setIsAlive(Predicate<Integer> isAlive) {
        this.isAlive = isAlive;
    }

    public void setGreet(Function<String, String> greet) {
        this.greet = greet;
    }

    public void setAttackStrategy(BiConsumer<String, Integer> attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
