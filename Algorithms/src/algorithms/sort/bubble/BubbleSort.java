package algorithms.sort.bubble;

import java.util.Arrays;

/* !!! Move bigger elements to the end (bubble biggest item). With every i iteration last i number is sorted */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        for(int i=0; i < arr.length-1; i++) { // count how many elements are already ordered
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public static int[] sortFromTheBack(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }


    public static int[] sortWithWhileLoop(int[] arr) {

        int i = arr.length - 2;

        while(i >=0) {
            for(int j = 0; j <= i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
            i--;
        }

        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}