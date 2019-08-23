package com;

import java.util.Scanner;

public class JavaEndOfFile {


    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-end-of-file/problem
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while(scanner.hasNext()) {
            System.out.println(++count + " " + scanner.nextLine());
        }
        scanner.close();
    }
}
