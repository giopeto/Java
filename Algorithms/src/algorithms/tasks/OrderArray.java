package algorithms.tasks;

import java.util.Arrays;

public class OrderArray {

    public static void main(String[] args) {
        // selection sort
        int[] arr = {6, 3, 1, 6, 4, 2};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 1 + i; j < arr.length; j++) {

                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }
}
