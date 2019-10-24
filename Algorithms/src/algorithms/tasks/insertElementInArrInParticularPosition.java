package algorithms.tasks;

import java.util.Arrays;

/*
*
* Insert 42 in 2 position in new int[]{0, 1, 2, 3, 4, 5}
* Start array   {0, 1, 2, 3, 4, 5}
* Result array  {0, 1, 42, 2, 3, 4, 5}
* */
public class insertElementInArrInParticularPosition {

    public static void main(String[] args) {
        int newElement = 42;
        int insertPosition = 2;

        mySort(new int[]{0, 1, 2, 3, 4, 5}, newElement, insertPosition);
        backSort(new int[]{0, 1, 2, 3, 4, 5}, newElement, insertPosition);
    }

    private static void backSort(int[] arr, int newElement, int insertPosition) {
        System.out.println("backSort");

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        int i = arr.length - 1;

        while(i > insertPosition) {
            newArr[i + 1] = arr[i];
            i--;
        }
        newArr[insertPosition + 1] =  newArr[insertPosition];
        newArr[insertPosition] = newElement;
        System.out.println(Arrays.toString(newArr));
    }

    private static void mySort(int[] arr, int newElement, int insertPosition) {
        System.out.println("mySort");
        int temp = 0;
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        for(int i = insertPosition; i < newArr.length; i++) {

            if(i != insertPosition) {
                int temp2 = newArr[i];
                newArr[i] = temp;
                temp = temp2;
            } else {
                temp = newArr[i];
                newArr[i] = newElement;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }

}
