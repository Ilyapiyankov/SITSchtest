package SITSchtest.com.samsung.MOD2.сц01112022.model;

public class Person {

    private String name;

    private int age;

    public void PrintNameAge(){
        System.out.println("Name: " + name+"\nage: "+age);
    }

    public void Birthday(){
        age ++;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}
