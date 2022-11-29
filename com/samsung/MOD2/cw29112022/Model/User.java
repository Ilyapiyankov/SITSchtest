package SITSchtest.com.samsung.MOD2.cw29112022.Model;

public abstract class User {

    String firstname, lastname;

    char[] phoneNumber;
    public boolean hasNoPhoneNumber(){
        return this.phoneNumber==null;
    }

    public abstract void sayHello();
}
