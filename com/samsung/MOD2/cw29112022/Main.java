package SITSchtest.com.samsung.MOD2.cw29112022;

import SITSchtest.com.samsung.MOD2.cw29112022.Model.Student;
import SITSchtest.com.samsung.MOD2.cw29112022.Model.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student at = new Student("Bob","Black","A-1");
        Student st = new Student(at);

        System.out.println(st.getPhoneNumber());
        System.out.println(st);
        System.out.println(st.getLastName());
        st.sayHello();

        ArrayList<String> subs = new ArrayList<>();
        subs.add("Math");
        subs.add("PE");

        var tch = new Teacher("Bob","Black","456456");

        tch.sayHello();

    }
}
