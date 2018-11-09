package challenges;

/*
* Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
* If there are two or more words that are the same length, return the first word from the string with that length.
* Ignore punctuation and assume sen will not be empty.
 * */
public class LongestWord {

    public static String LongestWord(String sen) {

        String longestWord = "";

        String[] arr = sen.split("[^A-Za-z0-9]");
        for (String s : arr) {
            if(longestWord.length() < s.length()) {
                longestWord = s;
            }
        }

        return longestWord;
    }

    public static void main (String[] args) {
        System.out.println(LongestWord("AA!! ASDdddddddfdsfd dasd"));
    }

    /*BEST*/
    /*public static String LongestWord(String sen) {
        String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
        int maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[maxIndex].length()) {
                maxIndex = i;
            }
        }
        return words[maxIndex];
    }*/

}
