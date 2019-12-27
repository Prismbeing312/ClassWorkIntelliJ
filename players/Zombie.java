package players;

public class Zombie extends Entity{
    public Zombie() {
        attackStrategy = new ZombieAttack();
        isAlive = new CheckAliveZombie();
        greet = new ZombieGreet();
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
