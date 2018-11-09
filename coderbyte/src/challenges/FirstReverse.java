package challenges;

/*
* Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
* For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH.

Use the Parameter Testing feature in the box below to test your code with different arguments.
* */
public class FirstReverse {

    public static String FirstReverse(String str) {

        System.out.println("One line answer: " + new StringBuilder(str).reverse().toString());

        StringBuffer result = new StringBuffer();
        char[] arr = str.toCharArray();
        for(int i = arr.length-1; i >= 0; i--) {
            result.append(arr[i]);
        }

        return result.toString();
    }

    public static void main (String[] args) {
        System.out.print(FirstReverse("coder byte"));
    }

}
