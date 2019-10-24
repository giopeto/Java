package algorithms.cpfromothertest.newspace.algorithms;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
public class RepeatedString {

	public static void main(String[] args) {
		//System.out.println(repeatedString("a", 1000000000000L));
		System.out.println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570L));
	}

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		long wholeCount =  n/s.length() > 0 ? countLetter(s, 'a') * n/s.length() : 0;
		int test = (int) (n%s.length());
		long partCount = test > 0 ? countLetter(s.substring(0, test), 'a') : 0;

		return  wholeCount + partCount;
	}

	private static long countLetter(String s, Character a) {
		long result = 0;
		for(char ch : s.toCharArray()) {
			if(ch == a) {
				result++;
			}
		}
		return result;
	}


	static long repeatedStringStream(String s, long n) {
		long wholeCount =  n/s.length() > 0 ? countLetterStream(s, "a") * n/s.length() : 0;
		long repeatPart = n%s.length();
		long partCount = n%s.length() > 0 ? countLetterStream(s.substring(0, (int) repeatPart), "a") : 0;

		return wholeCount + partCount;
	}

	private static long countLetterStream(String s, String l) {
		return Arrays.stream(s.split("")).
				filter(letter -> letter.equals(l)).
				count();
	}
}
