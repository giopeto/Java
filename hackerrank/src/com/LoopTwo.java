package com;

import java.util.Scanner;

public class LoopTwo {

    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-loops/problem

        StringBuilder resultString = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int x = 1; x<=n; x++) {
                int result = a;

                for(int j = 0; j<x; j++) {
                    result += (int) (Math.pow(2, j)*b);
                }
                resultString.append(result + " ");
            }
            System.out.println(resultString);
            resultString.setLength(0);
        }
        in.close();
    }
}

/*
2
0 2 10
5 3 5
* */
