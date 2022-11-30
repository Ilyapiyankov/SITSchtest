package SITSchtest.com.samsung.MOD2.cw29112022.Model;

public class Student extends User {

    //private String phoneNumber;
    private String group;

    public Student(String name, String lastname, String group, String phoneNumber) {
        this.firstname = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public Student(String name, String lastname, String group, Integer phoneNumber) {
        this.firstname = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber.toString();
        this.group = group;
    }

    public Student(String name, String lastname, String group, char[] phoneNumber) {
        this.firstname = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber.toString();
        this.group = group;
    }

    public Student(String name, String lastname, String group) {
        this.firstname = name;
        this.lastname = lastname;
        this.group = group;
        this.phoneNumber=null;
    }

    public Student(Student student) {
        this.firstname = student.getFirstName();
        this.lastname = student.getLastName();
        this.phoneNumber = student.getPhoneNumber();
        this.group = student.getGroup();
    }

    @Override
    public String toString() {

        return String.format(
                "name : %s, lastname: %s, phone's number: %s",
                this.firstname,
                this.lastname,
                this.phoneNumber == null ? "none" : phoneNumber
        );

    }

    public String getGroup() {
        return group;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getPhoneNumber() {
        return hasNoPhoneNumber() ? "No phone number" : phoneNumber;
    }

    /*public boolean hasNoPhoneNumber(){
        return this.phoneNumber==null;
    }*/

    @Override
    public void sayHello() {
        System.out.print(
                "Hi! It's student with firstname: "
                        + firstname
                        + ", lastname: "
                        + lastname
                        + ", my group is "
                        + group
        );

        if (hasNoPhoneNumber()) {
            System.out.println(" and I have no phone number.");
        } else {
            System.out.println(" my number is " + phoneNumber);
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
                        "has no phone.\n\n"
                        :
                        String.format("his number is %s\n\n", phoneNumber)
        );
    }
}
