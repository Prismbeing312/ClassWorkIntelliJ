package flyingAnimals;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
        this.canFly = new CanFlyFalse();
    }
}
