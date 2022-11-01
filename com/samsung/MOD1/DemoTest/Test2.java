package SITSchtest.com.samsung.MOD1.DemoTest;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if(a==1){
            System.out.println(1);
            return;
        }

        var mass = new int[a][a];

        for (int i = 0 ;  i<a ;i++){
            int ind = a-1-i;
            for (int j = 0; j < a; j++) {
                if (j<ind) mass[i][j]=0;
                else if (j==ind) mass[i][j]=1;
                else mass[i][j]=2;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
    }
}
