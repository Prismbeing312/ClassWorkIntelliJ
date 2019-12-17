package objects;

public class Pair2<T extends Entity, E extends Entity> {
    private T t;
    private E e;

    public Pair2(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public void declare(){
        System.out.println();
        t.speak();
        System.out.println();
        e.speak();
    }
}
