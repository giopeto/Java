package algorithms.cpfromothertest.newspace.algorithms;

// https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class CountingValleys {

	public static void main(String[] args) {
		countingValleys(8, "UDDDUDUU");
	}

	static int countingValleys(int n, String s) {
		int trackSteps = 0;
		int valleys = 0;

		for (char c : s.toCharArray()) {
			if(c == 'D') {
				trackSteps--;
			} else if(trackSteps == -1) {
				trackSteps++;
				valleys++;
			} else {
				trackSteps++;
			}
		}

		System.out.println("valleys: " + valleys);
		return valleys;
	}

	static int countingValleys2(int n, String s) {
		int trackSteps = 0;
		int prevTrackSteps = 0;
		int valleys = 0;

		for (char c : s.toCharArray()) {
			trackSteps += c == 'U' ? 1 : -1;
			if(prevTrackSteps < 0 && trackSteps == 0) {
				valleys++;
			}
			prevTrackSteps = trackSteps;
		}

		System.out.println("valleys: " + valleys);
		return valleys;
	}
}
