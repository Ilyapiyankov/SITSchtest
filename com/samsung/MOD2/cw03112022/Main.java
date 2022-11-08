package SITSchtest.com.samsung.MOD2.cw03112022;

import SITSchtest.com.samsung.MOD2.cw03112022.Model.Person;

public class Main {
    public static void main(String[] args) {


        Person man = new Person("BORYA",12);
        Person boris = new Person(null);

        System.out.println(boris.getAge());

    }
}
