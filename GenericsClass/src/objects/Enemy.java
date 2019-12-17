package objects;

public class Enemy extends Entity {

    public Enemy(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Kills them all!! "+getName());
    }
}
