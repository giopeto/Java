package challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
HARD
* Using the Java language, have the function KaprekarsConstant(num) take the num parameter being passed which will be a 4-digit number with at least two disti
 * should perform the following routine on the number:
 * Arrange the digits in descending order and in ascending order (adding zeroes to fit it to a 4-digit number),
 * and subtract the smaller number from the bigger number. Then repeat the previous step.
 * Performing this routine will always cause you to reach a fixed number: 6174.
 * Then performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174).
 * Your program should return the number of times this routine must be performed until 6174 is reached.
 * For example: if num is 3524 your program should return 3 because of the following steps:
 * (1) 5432 - 2345 = 3087, (2) 8730 - 0378 = 8352, (3) 8532 - 2358 = 6174.
 * */
public class KaprekarsConstant {
    public static int kaprekarsConstant(int num) {
        int counter = 0;

        return findNumber(num, counter);
    }

    private static int findNumber(int num, int counter) {


        Integer[] numArr = createArrayFromInt(num);

        Arrays.sort(numArr);

        int asc = getNumber(numArr);

        List<Object> list = Arrays.asList(numArr);
        Collections.reverse(list);

        Integer[] targetArray = list.toArray(new Integer[list.size()]);
        int desc = getNumber(targetArray);


        System.out.println(asc);
        System.out.println(desc);

        int result = desc - asc;
        if(result != 6174) {
            return findNumber(getNumber(createArrayFromInt(result)), ++counter);
        } else {
            System.out.println("Counter: " + counter);
            return ++counter;
        }
    }

    private static Integer[] createArrayFromInt(int num) {
        String[] strArr = new Integer(num).toString().split("");
        Integer[] numArr = new Integer[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            numArr[i] = new Integer(strArr[i]);
        }

        return numArr;
    }


    private static int getNumber(Integer[] numArr) {
        int num = 0;
        for(int i = 0; i < numArr.length; i++) {
            if(i == 0) {
                num += numArr[i]*1000;
            } else if(i == 1) {
                num += numArr[i]*100;
            } else if(i == 2) {
                num += numArr[i]*10;
            } else {
                num += numArr[i];
            }
        }

        return num;
    }

    public int best(int num) {
        if (num == 6174) {
            return 0;
        }
        int[] numArray = {num / 1000, num % 1000 / 100, num % 1000 % 100 / 10, num % 1000 % 100 % 10};
        int ascNum = 0;
        int desNum = 0;
        Arrays.sort(numArray);
        for (int i = 0; i < 4; i++) {
            desNum += (numArray[i] * (int)Math.pow(10, i));
            ascNum += (numArray[i] * (int)Math.pow(10, 3 - i));
        }
        return 1 + best(desNum - ascNum);
    }

    public static void main (String[] args) {
        // keep this function call here

        System.out.println(kaprekarsConstant(9830)); //5
    }
}
