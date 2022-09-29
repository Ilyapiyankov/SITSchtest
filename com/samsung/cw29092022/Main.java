package com.samsung.cw29092022;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        byte aByte = -128;

        float flt = in.nextFloat();
        double dbl = 1234567780.55555555555555;
        boolean cond = flt==dbl;

        System.out.println(cond);
        System.out.println((int)aByte+(byte)flt);


        in.close();
    }

}
