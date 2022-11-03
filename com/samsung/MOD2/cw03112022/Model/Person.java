package SITSchtest.com.samsung.MOD2.cw03112022.Model;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.age=age;
        this.name =name;
        System.out.println("Создан Person");
        printInfo();
    }

    public Person(Person person){
        if(person==null) {
            System.out.println("Sorry, it's Null");
        }else {
            this.age = person.age;
            this.name = person.name;
        }
    }

    public String getName() {return name;}

    public int getAge() { return age; }

    public void setAge(int age) {
        this.age = age>0 && age<150 ? age : this.age;
    }

    public void printInfo(){
        System.out.printf("age : %d, name : %s \n", age, name);
    }

}
