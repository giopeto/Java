package com.george.com;

/**
 * Created by George on 19.2.2017 г..
 */
public class CheckForDuplicateRowInArray {

	/*Напишете програма, която намира максималната редица от еднакви
	елементи в масив. Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1}  {2, 2, 2}.*/

	public static void main(String[] args) {
		int[] arr = {2, 1, 1, 2, 3, 3, 2, 2, 2, 1};
		int[] arr2 = {1, 22, 22};

		//int[] rowArr = new int[arr.length];

		/*for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}*/

		int longCnt = 0;
		int longChecked = 0;

		int thisCnt = 1;
		int thisChecked = 0;

		for (Integer value : arr) {

			if(thisChecked == value){
				thisCnt++;
			}else{
				thisChecked = value;
				thisCnt = 1;
			}

			if(thisCnt>longCnt){
				longCnt = thisCnt;
				longChecked = thisChecked;
			}
			System.out.println(
					"longCnt: " + longCnt + ", longChecked: " + longChecked +
							", thisCnt: " + thisCnt + ", thisChecked: " + thisChecked);


		}
		System.out.println(longCnt + " " + longChecked );

	}



}
