package challenges;

/*
* Using the Java language, have the function CheckNums(num1,num2) take both parameters being passed and return the string true if num2 is greater than num1,
* otherwise return the string false. If the parameter values are equal to each other then return the string -1.
 * */
public class CheckNums {

    public static String CheckNums(int num1, int num2) {
        int result = num1 - num2;
        if(result > 0) {
            return "false";
        } else if (result < 0) {
            return "true";
        }
        return "-1";

    }

    public static void main(String[] args) {
        System.out.println(CheckNums(1, 3));
    }
}
