package Run;

import comparable.Person;
import objects.Enemy;
import objects.Pair;
import objects.Pair2;
import objects.Player;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Pair2<Player, Enemy> a = new Pair2<>(new Player("jake", 23), new Enemy("Omer", 23));
//        a.declare();
        Person p = new Person(22, "Omer");
        Person p2 = new Person(11, "ZJake");
        Person[] persons = {p, p2};
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }

}
