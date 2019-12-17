package objects;

public class Player extends Entity {

    public Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Forward! we need to win! \n"+getName());
    }
}
