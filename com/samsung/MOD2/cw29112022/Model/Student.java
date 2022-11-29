package SITSchtest.com.samsung.MOD2.cw29112022.Model;

public class Student extends User{

    String group;

    public Student(String f, String l, Integer t){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=t;
    }
    public Student(String f, String l){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=null;
    }
    public Student(Student student){
        this.firstname = student.firstname;
        this.lastname = student.lastname;
        this.phoneNumber = student.phoneNumber;
    }

    @Override
    public void sayHello() {
        System.out.println(
                "Hello. It's student with firstname: "
                        +firstname
                        + " lastname: "
                        + lastname
        );

    }
}
