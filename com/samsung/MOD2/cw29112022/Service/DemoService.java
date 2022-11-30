package SITSchtest.com.samsung.MOD2.cw29112022.Service;

import SITSchtest.com.samsung.MOD2.cw29112022.Model.Student;
import SITSchtest.com.samsung.MOD2.cw29112022.Model.Teacher;
import SITSchtest.com.samsung.MOD2.cw29112022.Model.University;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoService {
    public DemoService() {
    }

    public void demo() {

        List<String> subjects = new LinkedList<String>();
        List<Teacher> teachers = new LinkedList<Teacher>();

        //Teacher[] teachers = new Teacher[3];

        teachers.add(new Teacher("ann", "Number1", 1231, new LinkedList<String>() ));
        teachers.add(new Teacher("ann", "Number2", 1232, new LinkedList<String>() ));
        teachers.add(new Teacher("ann", "Number3", 1233, new LinkedList<String>() ));

        teachers.get(0).addSubs("Math", "PE");
        teachers.get(1).addSubs("English");
        teachers.get(2).addSubs("Russian", "IT", "Biology");

        List<Student> students = new ArrayList<>();


        String address = "South street 56, buildings 1-8";

        University university = new University(teachers, students, address);

        university.addStudents(
                new Student("bob", "beep", "a"),
                new Student("biob", "bop", "a"),
                new Student("boib", "bap", "c", 45),
                new Student("bob", "rt", "c", 454345)
        );

        //university.addTeachers(teachers);

        university.printInfoToConsoleSuperKpacuBo();

    }
}
