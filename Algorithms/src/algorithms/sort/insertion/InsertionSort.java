package algorithms.sort.insertion;

import java.util.Arrays;

/*
Insertion sort maintains a sorted sub-array, and repetitively inserts new elements into it. The process is as following:

Take the first element as a sorted sub-array.
Insert the second element into the sorted sub-array (shift elements if needed).
Insert the third element into the sorted sub-array.
Repeat until all elements are inserted
* */
public class InsertionSort {

    public static int[] sort(int[] arr) {

        for(int i = 1; i < arr.length; i++) { // loop through array. Decide that first element is sorted
            int j;
            int temp = arr[i]; // current

            for(j = i; j > 0; j--) {    // loop through sorted elements
                if(arr[j-1] < temp) {   // and check if they are smaller then current
                    break;              // current is bigger so end loop
                }
                arr[j] = arr[j-1];      // current element is smaller and need to move back. Copy previous element here and ...
            }

            arr[j] = temp;              // ... add the right value here
        }

        return arr;
    }
}