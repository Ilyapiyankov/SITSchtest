package SITSchtest.com.samsung.MOD1.DemoTest;


import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        int[][] a;

        //ввожу это в ответ
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        if (n==1 && m==1){
            System.out.println("   "+0);
            return;
        }

        a = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                a[i][j] = j*i;
            }

        }

        if (n==1){
            for (int i = 0;i<m;i++){
                System.out.print("   "+a[0][i]);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(
                        (a[i][j] >9 ? "  " : "   ")
                        +a[i][j]
                        );

            }
            System.out.println();
        }
        //////////////
    }
}