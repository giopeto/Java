package challenges;

/*
* Using the Java language, have the function TimeConvert(num) take the num parameter being passed and
* return the number of hours and minutes the parameter converts to
* (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon.
 * */
public class TimeConvert {

    public static String timeConvert(int num) {
        int hours = num/60;
        int minutes = num - (hours*60); // num%60 is better

        // return String.valueOf(num/60)+":"+String.valueOf(num%60);

        return new StringBuilder().append(String.valueOf(hours)).append(":").append(String.valueOf(minutes)).toString();
    }

    /* Best answer */
    public static String timeConvertBest(int num) {
        return (num / 60 + ":" + num % 60);
    }

    public static void main(String[] args) {
        System.out.println(timeConvertBest(65));
    }
}
