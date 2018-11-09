package challenges;

/*
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num.
 * For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10.
 * For the test cases, the parameter num will be any number from 1 to 1000.
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 * */
public class SimpleAdding {
    public static int simpleAdding(int num) {

        int result = 0;
        while(num > 0) {
            result += num;
            num--;
        }

        return result;
    }

    public static int simpleAddingRecursion(int num) {
       return num ==0 ? 0 : num + simpleAddingRecursion(num - 1);
       /*
        3 +
        2 +
        1 +
        0
        * */
    }

    public static int simpleAddingMath(int num) {
        return (num*(num+1))/2;
    }


    public static void main(String[] args) {
        System.out.println(simpleAdding(5));
    }
}
