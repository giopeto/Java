package algorithms.cpfromothertest.newspace.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

/*
    Find a peak element
    Given an array of integers. Find a peak element in it.
    An array element is peak if it is NOT smaller than its neighbors.
    For corner elements, we need to consider only one neighbor.
    For example, for input array {5, 10, 20, 15}, 20 is the only peak element.
    For input array {10, 20, 15, 2, 23, 90, 67}, there are two peak elements: 20 and 90.
    Note that we need to return any one peak element.
*/
public class PeakFinding {

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 67, 800};

        //findJustOnePeak(arr, 0, arr.length-1);
        findPeakLinear(arr);
        findPeakLinear(new int[]{5, 10, 20, 15});
        findPeakLinear(new int[]{10, 20, 30, 40, 50});
        findPeakLinear(new int[]{100, 80, 60, 50, 20});

    }

    private static void findPeakLinear(int[] arr) {
        List<Integer> peaks = new ArrayList<>();
        for(int i = 0; i< arr.length; i++) {
            if(i==0) {
                if(arr[i] >= arr[i+1]) {
                    peaks.add(arr[i]);
                }
            } else if (i == arr.length-1) {

                if(arr[i] >= arr[i-1]) {
                    peaks.add(arr[i]);
                }
            } else {
                if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                    peaks.add(arr[i]);
                }
            }
        }
        System.out.println(peaks);
    }

    /*private static void findJustOnePeak(int[] arr, int startIndex, int endIndex) {
        List<Integer> peaks = new ArrayList<>();
        int midArrIndex = startIndex + (endIndex - startIndex)/2;

        System.out.println("Check " + arr[midArrIndex] + " and " + arr[midArrIndex-1] + " , " + arr[midArrIndex+1]);

        if(arr[midArrIndex] >= arr[midArrIndex-1] && arr[midArrIndex] >= arr[midArrIndex+1]) {
            System.out.println("Find a peak at: " + midArrIndex + " : " + arr[midArrIndex]);
        } else if(arr[midArrIndex] < arr[midArrIndex-1]) {
            findJustOnePeak(arr, 0, midArrIndex-1);
        } else {
            findJustOnePeak(arr, midArrIndex+1, arr.length-1);
        }
    }*/
}
