package algorithms.cpfromothertest;

import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 30, 1,2,6,4,9,6,4,5,8,0,55,6,77,834,45,33,3,6,77,8,9,6, 20};

        sortArray(arr);
        System.out.println(Arrays.toString(arr));
        findNumber(arr, 2, 0, arr.length-1);


        System.out.println(Arrays.toString(
                rotLeft(new int[]{1, 2, 3, 4, 5}, 2)
        ));
    }

    private static int[] rotLeft(int[] arr, int rCount) {
        while(rCount > 0) {
            int temp = 0;

            // 1 2 3 4 5

            //1 iteration
            // 2 2 3 4 5
            //2 iteration
            // 2 3 3 4 5
            //3 iteration
            // 2 3 4 4 5
            //4 iteration
            // 2 3 4 5 5

            int firstEl = arr[0];
            for(int i = 0; i<arr.length-1; i++) {
                arr[i] = arr[i+1];
            }

            arr[arr.length-1] = firstEl;

            rCount--;
        }

        return arr;
    }

    private static void sortArray(int[] arr) {
        int temp;
        for(int i =0; i< arr.length; i++) {
            for(int j = i + 1; j< arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void findNumber(int[] arr, int searchNumber, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            System.out.println("Cant find " + searchNumber);
            return;
        }

        int middleIndex = startIndex + (endIndex - startIndex)/2;

        System.out.println(arr[middleIndex]);
        if(arr[middleIndex] == searchNumber) {
            System.out.println("Found it at: " + middleIndex);
        } else if (arr[middleIndex] > searchNumber) {
            findNumber(arr, searchNumber, startIndex, middleIndex-1);
        } else {
            findNumber(arr,searchNumber, middleIndex + 1, arr.length - 1);
        }
    }

}
