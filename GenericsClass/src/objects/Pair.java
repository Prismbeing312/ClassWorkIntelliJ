package objects;

public class Pair<T, E> {
    private T t;
    private E e;

    public Pair(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public String returnType(){
        return t.getClass().getName() + " " + e.getClass().getName();
   }

    @Override
    public String toString() {
        return " "+ t;
    }
}