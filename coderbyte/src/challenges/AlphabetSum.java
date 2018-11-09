package challenges;

import java.util.Arrays;

/*
* Using the Java language, have the function AlphabetSoup(str) take the str string parameter being passed and
* return the string with the letters in alphabetical order (ie. hello becomes ehllo).
* Assume numbers and punctuation symbols will not be included in the string.
 * */
public class AlphabetSum {

    public static String alphabetSoup(String str) {

        char[] characters = str.toCharArray();

        for(int i = 0; i < characters.length; i++) {
            for(int j = i+1; j < characters.length; j++) {
                if(characters[i] > characters[j]) {
                    char temp = characters[i];
                    characters[i] = characters[j];
                    characters[j] = temp;
                 }
            }
        }

        return new String(characters);
    }

    public static String best(String str) {
        char[] strChars = str.toCharArray();
        Arrays.sort(strChars);
        return new String(strChars);
    }

    public static void main (String[] args) {

        System.out.print(alphabetSoup("coderbyte"));
    }

}
