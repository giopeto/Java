package algorithms.cpfromothertest.newspace.algorithms.arrays;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class LeftRotation {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(
				rotLeft(new int[]{1, 2, 3, 4, 5}, 2)
		));
	}

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		while(--d >= 0) {
			int first = a[0];
			for(int i = 0; i < a.length-1; i++) {
				a[i] = a[i+1];
			}
			a[a.length-1] = first;
		}

		return  a;
	}

}
