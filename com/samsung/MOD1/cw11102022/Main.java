package SITSchtest.com.samsung.MOD1.cw11102022;

public class Main {
    public static void main(String[] args) {

        var a = 0;
        while (a<100){
            System.out.print(a++ +" ");
        }

        do {
            System.out.println(123455+"---------------");
            a++;
        }while (a<1000);

        for (int i = 0; i < a; i++) {
            if (i%23==0) continue;
            System.out.println(a+i);
        }

    }
}
