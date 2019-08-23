package com;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-output-formatting/problem
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);

        }
        System.out.println("================================");
    }
}


/*
Input
java 100
cpp 65
python 50
* */