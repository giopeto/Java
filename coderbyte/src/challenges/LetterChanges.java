package challenges;

import java.util.HashMap;

/*
* Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm.
* Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
* Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.

Use the Parameter Testing feature in the box below to test your code with different arguments.
* */
public class LetterChanges {

    public static String letterChanges(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        HashMap<Character, Character> hashMap = new HashMap(){{
            put('a', 'A');
            put('e', 'E');
            put('i', 'I');
            put('o', 'O');
            put('u', 'U');
        }};

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stringBuilder2.append(ch);

            if (stringBuilder2.toString().matches("[a-zA-z0-9]")) {
                ch = (char) (str.charAt(i) + 1);
            }
            stringBuilder2.deleteCharAt(0);


            if(hashMap.containsKey(ch)) {
                ch = hashMap.get(ch);
            }
            stringBuilder.append(ch);
        }

        return stringBuilder.toString();
    }

    public static void main (String[] args) {
        System.out.print(letterChanges("beautiful^"));
    }
}
