package SITSchtest.com.samsung.MOD2.cw29112022.Model;

import java.util.List;

public class Teacher extends User{

    private List<String> subjects;

    public Teacher(String f, String l,String t, List<String> subjects){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=t;
        this.subjects=subjects;
    }
    public Teacher(String f, String l, char[] t, List<String> subjects){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=t.toString();
        this.subjects=subjects;
    }
    public Teacher(String f, String l, Integer t, List<String> subjects){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=t.toString();
        this.subjects=subjects;
    }
    public Teacher(String f, String l,String t){
        this.firstname=f;
        this.lastname=l;
        this.phoneNumber=t;
        this.subjects=null;
    }
    public Teacher(Teacher teacher){
        this.firstname = teacher.getFirstName();
        this.lastname = teacher.getLastName();
        this.phoneNumber = teacher.getPhoneNumber();
        this.subjects = teacher.getSubjects();
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public String getPhoneNumber(){
        return hasNoPhoneNumber() ? "No phone number" : phoneNumber;
    }

    public List<String> getSubjects(){return subjects;}

    public boolean hasNoSubs(){
        return subjects==null || subjects.isEmpty();
    }

    public void AddSubs(String... subs){
        for (var a : subs) {
            if (subjects.contains(a)) continue;
            else subjects.add(a);
        }
    }
    public void AddSubs(List<String> subs){
        subjects=subs;
    }

    @Override
    public void sayHello() {

        System.out.printf(
                "Hello. I'm teacher, my name is %s and lastname is %s. My phone number is %s\n",
                firstname,lastname,
                hasNoPhoneNumber() ? "none" : phoneNumber
        );
        if (hasNoSubs()){
            System.out.println("I have no subjects to teach");
            return;
        }
        String str = "";
        for (var i: subjects) {
            str+=i+", ";
        }
        System.out.println("My subjects: "+ str);
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        String ans = "";

        ans = String.format(

                "Name:%s, lastname:%s, %s",
                firstname,
                lastname,
                hasNoPhoneNumber() ?
                        "has no phone."
                        :
                        String.format("number is %s.", phoneNumber)

        );

        if (hasNoSubs()){
            System.out.println("I have no subjects to teach");
            return;
        }
        String str = "";
        for (var i: subjects) {
            str+=i+", ";
        }
        System.out.println(ans+"\nMy subjects: "+ str.substring(0,str.length()-2)+".");
    }
}
