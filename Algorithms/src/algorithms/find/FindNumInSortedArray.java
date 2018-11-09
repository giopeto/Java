package algorithms.find;

import java.util.Arrays;

public class FindNumInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        findNumber(arr, 6);
    }

    private static void findNumber(int[] arr, int number) {
        int midIndex = arr.length/2;
        if(arr[midIndex] == number) {
            System.out.println("Found: " + arr[midIndex]);
        } else if(arr[midIndex] > number) {
            int[] newArr = Arrays.copyOfRange(arr, 0, midIndex);
            findNumber(newArr, number);
        } else {
            int[] newArr = Arrays.copyOfRange(arr, midIndex, arr.length);
            findNumber(newArr, number);
        }
    }
}
