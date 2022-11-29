package SITSchtest.com.samsung.MOD2.cw29112022.Model;

import java.util.List;

public class University implements Printer {
    private List<Teacher> teachers;
    private List<Student> students;

    public final String address;

    public University(List<Teacher> teachers,List<Student> students, String address){
        this.teachers = teachers;
        this.students = students;
        this.address = address;
    }
    public University(University university){
        if (university==null){
            this.teachers=null;
            this.students=null;
            this.address=null;
        }
        else {
            this.teachers = university.teachers;
            this.students = university.students;
            this.address = university.address;
        }

    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {

        System.out.println("-".repeat("Попробуйте новую кроссплатформенную оболочку PowerShell (https://aka.ms/pscore6)".length()));

        if ( ! ( teachers == null || teachers.isEmpty())){
            System.out.println("Teachers:");
            for (var i :teachers) {
                i.printInfoToConsoleSuperKpacuBo();
            }
        }
        else System.out.println("No teachers");

        if ( ! ( students==null || students.isEmpty())){
            System.out.println("Students:");
            for (var i :students) {
                i.printInfoToConsoleSuperKpacuBo();
            }
        }
        else System.out.println("No students");

        System.out.println("-".repeat("Попробуйте новую кроссплатформенную оболочку PowerShell (https://aka.ms/pscore6)".length()));

    }

    public void addStudents(Student... students){
        for (var i : students) {
            if (!this.students.contains(i)) this.students.add(i);
        }
    }

    public void addTeachers(Teacher... teachers){
        for (var i : teachers) {
            if (!this.teachers.contains(i)) this.teachers.add(i);
        }
    }

}
