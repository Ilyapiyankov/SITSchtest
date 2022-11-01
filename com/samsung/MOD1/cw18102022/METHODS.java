package SITSchtest.com.samsung.MOD1.cw18102022;

import java.util.Scanner;

public class METHODS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(sc.nextInt()+sc.nextInt());

        sc.close();

    }

    public static void Print(int nm){
        System.out.println(nm);
    }
    public static int SumAndMulti(int a, int b){
        return b*(a+b);
    }
}
