package challenges;

/*
* Using the Java language, have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word.
* Words will be separated by only one space.
 * */
public class LetterCapitalize {

    public static String letterCapitalize(String str) {
        String[] strArr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : strArr) {
            stringBuilder.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(letterCapitalize("hello world"));
    }
}
