package tasks;

import java.util.HashMap;
import java.util.Map;

public class balancedParenthessesInExpression {

    public static void main(String[] args) {
        String test = "[]{({[][{}}]})}";
        checkBalance(test);
    }

    private static void checkBalance(String test) {
        Map<Character, Integer> specialCharacters = new HashMap<>();
        specialCharacters.put('[', 1);
        specialCharacters.put(']', -1);
        specialCharacters.put('{', 2);
        specialCharacters.put('}', -2);
        specialCharacters.put('(', 3);
        specialCharacters.put(')', -3);

        int sum = 0;
        for (char c : test.toCharArray()) {
            sum += specialCharacters.get(c);
        }

        if(sum == 0) {
            System.out.println("It's ok");
        } else {
            System.out.println("Not ok");
        }
    }

}
