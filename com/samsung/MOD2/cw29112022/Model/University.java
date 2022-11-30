package SITSchtest.com.samsung.MOD2.cw29112022.Model;

import java.util.ArrayList;
import java.util.List;

public class University implements Printer {
    private List<Teacher> teachers;
    private List<Student> students;

    public final String address;

    public University(List<Teacher> teachers, List<Student> students, String address) {
        this.teachers = new ArrayList<>();

        for (var teacher : teachers) {
            if (!this.teachers.contains(teacher)) this.teachers.add(teacher);
        }

        this.students = new ArrayList<>();

        for (var student : students) {
            if (!this.students.contains(student)) this.students.add(student);
        }

        this.address = address;
    }

    public University(University university) {
        if (university == null) {
            this.teachers = null;
            this.students = null;
            this.address = null;
        } else {
            this.teachers = university.teachers;
            this.students = university.students;
            this.address = university.address;
        }

    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {

        System.out.println("-".repeat("Попробуйте новую кроссплатформенную оболочку PowerShell (https://aka.ms/pscore6)".length()));

        if (!(teachers == null || teachers.isEmpty())) {

            System.out.println("Teachers:");

            for (var i : teachers) {
                i.printInfoToConsoleSuperKpacuBo();
            }

        } else System.out.println("No teachers");

        if (!(students == null || students.isEmpty())) {

            System.out.println("Students:");

            for (var i : students) {
                i.printInfoToConsoleSuperKpacuBo();
            }

        } else System.out.println("No students");

        System.out.println("-".repeat("Попробуйте новую кроссплатформенную оболочку PowerShell (https://aka.ms/pscore6)".length()));

    }

    public void addStudents(Student... students) {
        for (var student : students) {
            if (!this.students.contains(student)) this.students.add(student);
        }
    }

    public void addTeachers(Teacher... teachers) {
        for (var teacher : teachers) {
            if (!this.teachers.contains(teacher)) this.teachers.add(teacher);
        }
    }

}
