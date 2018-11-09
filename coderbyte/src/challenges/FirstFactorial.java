package challenges;

import java.util.Scanner;

/*
 *
 * Using the Java language, have the function FirstFactorial(num)
 *   take the num parameter being passed and return the factorial of it (e.g. if num = 4, return (4 * 3 * 2 * 1)).
 * For the test cases, the range will be between 1 and 18 and the input will always be an integer.
 * */
public class FirstFactorial {

    public static int firstFactorial(int num) {
        int sum = 1;
        while(num > 0) {
            sum = sum * num--;
        }

        return sum;
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println(firstFactorial(5));

        test(4, 24);
        test(5, 120);
        test(8, 40320);
    }

    private static void test(int testVal, int result) {
        if(firstFactorial(testVal) == result) {
            System.out.println("OK");
        } else {
            System.out.println("****** NOT OK ******");
        }

    }
}
