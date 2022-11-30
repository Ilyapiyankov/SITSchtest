package SITSchtest.com.samsung.MOD2.cw29112022.Service;

import SITSchtest.com.samsung.MOD2.cw29112022.Model.Student;
import SITSchtest.com.samsung.MOD2.cw29112022.Model.Teacher;
import SITSchtest.com.samsung.MOD2.cw29112022.Model.University;

import java.util.ArrayList;
import java.util.List;

public class DemoService {
    public DemoService() {
    }

    public void demo() {

        List<String> subjects = new ArrayList<>();

        Teacher[] ts = new Teacher[3];

        ts[0] = new Teacher("ann", "Number1", 1231, subjects);
        ts[1] = new Teacher("ann", "Number2", 1232, subjects);
        ts[2] = new Teacher("ann", "Number3", 1233, subjects);

        ts[0].addSubs("Math", "PE");
        ts[1].addSubs("English");
        ts[2].addSubs("Russian", "IT", "Biology");

        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();


        String address = "South street 56, buildings 1-8";

        University university = new University(teachers, students, address);

        university.addStudents(
                new Student("bob", "beep", "a"),
                new Student("biob", "bop", "a"),
                new Student("boib", "bap", "c", 45),
                new Student("bob", "rt", "c", 454345)
        );

        university.addTeachers(ts);

        university.printInfoToConsoleSuperKpacuBo();

    }
}
