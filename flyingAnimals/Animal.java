package flyingAnimals;

public abstract class Animal {
    protected String name;
    protected int age;

    protected CanFly canFly;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void canItFly(){
        this.canFly.flyAbility();
    }

    public CanFly getCanFly() {
        return canFly;
    }

    public void setCanFly(CanFly canFly) {
        this.canFly = canFly;
    }
}
