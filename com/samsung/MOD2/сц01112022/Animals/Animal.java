package SITSchtest.com.samsung.MOD2.сц01112022.Animals;

public class Animal {

    static char[] word = null;
    int age;
    int paws;

    boolean hasWool;//есть ли шерсть

    char[] woolColor;
    char[] Name;

    public static void SaySMTH(){
        System.out.println(word);
    }

    public Animal(int age, int paws, boolean has, char[] woolColor, char[] Name){

        this.age = age;
        this.paws =paws;
        this.hasWool =has;
        this.woolColor = woolColor;
        this.Name = Name;

    }

    public Animal(int age, int paws, boolean has, char[] Name){

        if (has){
            this.age = age;
            this.paws =paws;
            this.hasWool =has;
            this.woolColor = "no".toCharArray();
            this.Name = Name;
        }

        else {

            this.age = age;
            this.paws =paws;
            this.hasWool =has;
            this.woolColor = null;
            this.Name = Name;

        }

    }
}