package algorithms.cpfromothertest.newspace.algorithms.arrays;

import static java.util.Arrays.sort;

public class FindNumberInSortedArrayBinarySearch {

    public static void main(String[] args) {
        //int[] arr = {2, 3, 4, 10, 40 };
        int[] arr = {10, 30, 1,2,6,4,9,6,4,5,8,0,55,6,77,834,45,33,3,6,77,8,9,6, 20};
        sort(arr);
        findNumber(arr, 8, 0 ,arr.length-1);

    }

    private static void findNumber(int[] arr, int n, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            System.out.println(n + " is not present");
            return;
        }
        int test = arr.length/2;
        int middleArrIndex = startIndex + (endIndex-startIndex)/2;
        System.out.println(arr[middleArrIndex]);


        System.out.println("test: " + test + ", middleArrIndex: " + middleArrIndex);

        if(arr[middleArrIndex] == n) {
            System.out.println("Found n: " + arr[middleArrIndex]);
        } else if(arr[middleArrIndex] > n) {
            findNumber(arr, n, startIndex, middleArrIndex-1);
        } else {
            findNumber(arr, n, middleArrIndex+1, arr.length-1);
        }

    }
}
