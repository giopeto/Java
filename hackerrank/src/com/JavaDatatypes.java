package com;

import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-datatypes/problem

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x == (short) x) System.out.println("* short");
                if (x == (int) x) System.out.println("* int");
                if (x == (long) x) System.out.println("* long");
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
/*
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
* */