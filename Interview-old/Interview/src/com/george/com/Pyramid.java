package com.george.com;

/**
 * Created by George on 8.3.2017 г..
 */
public class Pyramid {

	public static void main(String[] args) {
		/*int k = 2;
		for (int i = 2; i <= 4; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.print("*");
			}
			k += i;
			System.out.println();
		}*/

	/*	for(int i=5; i>0 ;i--){
			for(int j=0; j < i; j++){
				System.out.print(j+1);
			}
		}*/

		int n =6;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}


	}
}
