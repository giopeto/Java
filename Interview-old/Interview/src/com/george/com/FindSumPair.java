package com.george.com;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by george on 3/7/17.
 */
public class FindSumPair {

    public static void main(String[] args){
        int theSum = 8;
        int[] arr1 = {1,4,3,8};
        int[] arr2 = {1,2,4,4};

        boolean check1 = checkOredered(arr1, theSum);
        boolean check2 = checkOredered(arr2, theSum);
        System.out.println(check1);
        System.out.println(check2);

        boolean check3 = checkUnoredered(arr1, theSum);
        boolean check4 = checkUnoredered(arr2, theSum);
        System.out.println(check3);
        System.out.println(check4);
    }

    private static boolean checkUnoredered(int[] arr, int theSum) {

        Set neededNum = new HashSet<>();

        for (int i:arr) {
            if(neededNum.contains(i)){
                return true;
            } else{
                neededNum.add(theSum-i);
            }
        }

        return false;
    }

    public static boolean checkOredered(int[] arr, int theSum){
        int startIndex = 0;
        int endIndex = arr.length-1;

        int check;

        while(startIndex<endIndex){
            check = arr[startIndex]+arr[endIndex];

            if(check==theSum){
                return true;
            }else if(check>theSum){
                endIndex--;
            }else{
                startIndex++;
            }
        }

        return false;
    }




}
