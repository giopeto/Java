package algorithms.cpfromothertest;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int[] arr = {4,3,3,9};


		for(int i= 0; i<arr.length; i++) {

			for(int j = i+1; j<arr.length; j++){
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int a = 0;
		System.out.println(++a);
		System.out.println(a);



	}
}
