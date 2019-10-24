package algorithms.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/pairs/problem
public class Pairs {


    public static void main(String[] args) {
        pairs(2, new int[]{1, 5, 3, 4, 2});
    }


    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] - arr[j] > k || arr[j] - arr[i] > k) {
                    break;
                }
                if(arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;
    }

    // Complete the pairs function below.
    static int pairsSlow2(int k, int[] arr) {
        int count = 0;
        List<Integer> desiredNumbers = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            desiredNumbers.add(arr[i] - k);
        }

        for(int i = 0; i < arr.length; i++) {
            if(desiredNumbers.isEmpty()) {
                break;
            }
            if(desiredNumbers.contains(arr[i])) {
                count++;
                desiredNumbers.remove(desiredNumbers.indexOf(arr[i]));
            }
        }

        System.out.println(count);
        return count;
    }

    // Complete the pairs function below.
    static int pairsSlow(int k, int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i == j) {
                    continue;
                }

                if(arr[i] - arr[j] == k) {
                    count++;
                }

            }
        }

        System.out.println(count);
        return count;
    }
}
