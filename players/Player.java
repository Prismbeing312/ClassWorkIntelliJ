package players;

public class Player extends Entity{
    public Player() {
        attackStrategy = new PlayerAttack();
        isAlive = new CheckAlive();
        greet = new PlayerGreet();
    }

    @Override
    public void attack(String name, Integer age) {
        attackStrategy.accept(name, age);
    }

    @Override
    public void printIsAlive(int health) {
        System.out.println(isAlive.test(health));
    }

    @Override
    public void greeting(String name) {
        System.out.println(greet.apply(name));
    }


}
