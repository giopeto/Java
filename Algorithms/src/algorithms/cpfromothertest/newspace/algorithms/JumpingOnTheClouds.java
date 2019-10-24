package algorithms.cpfromothertest.newspace.algorithms;

import java.util.HashMap;

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class JumpingOnTheClouds {
	public static void main(String[] args) {
		int num = 6;
		int[] clouds = {0, 0, 0 , 1, 0, 0};
		moveTest(num, clouds);
		num = 7;
		int[] clouds2 = {0, 0, 1, 0, 0, 1, 0};
		moveTest(num, clouds2);
	}

	private static void moveTest(int num, int[] clouds) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int move = 0;
		for(int i=0; i< num; i++) {

			if (i<num-2 && clouds[i+2] == 0) {
				move++;
				map.put(i+2, move);
				i++;
			} else if(i!=num-1) {
				move++;
				map.put(i+1, move);
			}
		}
		System.out.println(map);
		System.out.println(move);
	}


}
