package com.george.com;

import java.util.ArrayList;
import java.util.*;
/**
 * Created by George on 19.2.2017 г..
 */
public class SortArray {
	public static void main(String[] args) {
		int[] arr = {2,3, 4, 1};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i]<arr[j]){
					System.out.println("Element " +i + " go ot " + j);
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
