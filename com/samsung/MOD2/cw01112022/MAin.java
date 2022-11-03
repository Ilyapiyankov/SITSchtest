package SITSchtest.com.samsung.MOD2.cw01112022;

import SITSchtest.com.samsung.MOD2.cw01112022.model.Person;

public class MAin {
    public static void main(String[] args) {

        Person person1 = new Person("",8);
        Person person2 = new Person("",8);

        person2.Birthday();

        person1.PrintNameAge();

        System.out.println(person1+" "+person2);

    }
}