package SITSchtest.com.samsung.MOD1.cw13102022;


public class Main {
    public static void main(String[] args) {
        int[] mass;

        mass = new int[2];
        mass = new int[50];

        for (int i = 0; i < mass.length; ++i) {
            mass[i] = i+9 + i*5/2;

        }

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }

    }
}
