package algorithms.cpfromothertest.newspace.algorithms.arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int[][] mArr = {{1, 2, 3}, {10, 20, 30}};

		System.out.println(Arrays.toString(mArr[0])); // [1, 2, 3]
		System.out.println(Arrays.toString(mArr[1])); // [10, 20, 30]
		
		System.out.println(mArr[0][0]); // 1
		System.out.println(mArr[1][0]); // 10
		System.out.println(mArr[1][1]); // 20
	}
}
