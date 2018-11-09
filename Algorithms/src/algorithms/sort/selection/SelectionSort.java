package algorithms.sort.selection;
/*

Selection sort is to repetitively pick up the smallest element and put it into the right position:

Find the smallest element, and put it to the first position.
Find the next smallest element, and put it to the second position.
Repeat until all elements are in the right positions.
A loop through the array finds the smallest element easily.
After the smallest element is put in the first position, it is fixed and then we can deal with the rest of the array.

* */
/* !!! Move smallest element at the beginning (select and move smallest)*/
public class SelectionSort {

    public static int[] sort(int[] arr) {
        int arrLength = arr.length;
        int min;
        for(int i = 0; i < arrLength; i++ ) {
            min = i;
            for(int j = i + 1; j < arrLength; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            if(i != min) {
                swap(arr, i, min);
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
