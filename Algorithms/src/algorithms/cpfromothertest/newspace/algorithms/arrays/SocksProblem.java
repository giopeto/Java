package algorithms.cpfromothertest.newspace.algorithms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class SocksProblem {
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		int num = 10;

		sortSockMethod(arr, num);
		mapSockMethod(num, arr);
	}

	private static void sortSockMethod(int[] arr, int num) {
		int res= 0;
		int lastNum = 0;
		Arrays.sort(arr);

		for(int i = 0; i < num; i++) {
				if(lastNum > 0 && lastNum == arr[i]) {
					res++;
					lastNum = 0;
				} else {
					lastNum = arr[i];
				}
		}
		System.out.println(res);
	}

	private static void mapSockMethod(int num, int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		int res = 0;

		for(int key : map.keySet()) {
			res += map.get(key)/2;
		}

		System.out.println(res);
	}
}
