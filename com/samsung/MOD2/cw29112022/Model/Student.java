package SITSchtest.com.samsung.MOD2.cw29112022.Model;

public class Student extends User{

    private String group;

    public Student(String f, String l, String group, String t){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=t.toCharArray();
        this.group = group;
    }
    public Student(String f, String l, String group, Integer t){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=t.toString().toCharArray();
        this.group = group;
    }
    public Student(String f, String l, String group, char[] t){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=t;
        this.group = group;
    }
    public Student(String f, String l,String group){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=null;
        this.group=group;
    }
    public Student(Student student){
        this.firstname = student.getFirstName();
        this.lastname = student.getLastName();
        this.phoneNumber = student.getPhoneNumber().toCharArray();
        this.group = student.getGroup();
    }

    @Override
    public String toString() {
        return String.format(
                "name : %s, lastname: %s, phone's number: %s",
                this.firstname,
                this.lastname,
                this.phoneNumber==null ? "none" : phoneNumber.toString()
                );
    }

    public String getGroup() {
        return group;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public String getPhoneNumber(){
        return hasNoPhoneNumber() ? "No phone number" : phoneNumber.toString();
    }

    /*public boolean hasNoPhoneNumber(){
        return this.phoneNumber==null;
    }*/

    @Override
    public void sayHello() {
        System.out.print(
                "Hi! It's student with firstname: "
                        +firstname
                        + ", lastname: "
                        + lastname
                        +", my group is "
                        +group
        );
        if (hasNoPhoneNumber()){
            System.out.println(" and I have no phone number.");
        }
        else {
            System.out.println(" my number is "+phoneNumber.toString());
        }
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.printf(
                "Name:%s, lastname:%s, group:%s, %s",
                firstname,
                lastname,
                group,
                hasNoPhoneNumber() ?
                        "but he has no phone.\n\n"
                        :
                        String.format("his number is %s\n\n", phoneNumber.toString())
                );
    }
}
