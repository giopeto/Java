package datastructures.hackerrank.stackAndQueue;

import java.util.Stack;

public class balancedParenthessesInExpression {

    private static char[][] TYPES = {{'[', ']'}, {'{', '}'}, {'(', ')'}};
    private static String testExpression = "([]{[][{}(({[]}))]})";

    public static boolean testForBalance(String testExpression) {
        Stack<Character> stack = new Stack();
        for(char c : testExpression.toCharArray()) {
            if(checkForOpened(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !matches(stack.pop(), c)){
                return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        for (char[] charArr : TYPES) {
            if(charArr[0] == open) {
                return charArr[1] == close;
            }
        }
        return false;
    }

    private static boolean checkForOpened(char c) {
        for (char[] charArr : TYPES) {
            if(charArr[0] == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(testForBalance(testExpression));
    }
}
