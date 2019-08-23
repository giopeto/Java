package com.george.com;

/**
 * Created by George on 19.2.2017 г..
 */
public class PrimeNumber {
	public static void main(String[] args) {
		int pn = 5;
		boolean isPrime = checkIsPrime(pn);
		boolean isPrime2 = checkIsPrime2(pn);
		System.out.println(isPrime);
	}

	private static boolean checkIsPrime(int pn) {

		if (pn<2){
			return false;
		}

		for(int i=2; i<pn; i++){
			System.out.println(i + " % " + pn + " = " + (double)pn/i);
			if(pn%i==0){
				return false;
			}
		}

		return true;
	}

	private static boolean checkIsPrime2(int pn) {

		if (pn<2){
			return false;
		}

		System.out.println("****************************");
		for(int i=2; i<pn/2; i++){
			System.out.println(i + " % " + pn + " = " + (double)pn/i);
			if(pn%i==0){
				return false;
			}
		}
		return true;
	}



}

/*

2 % 11 = 5.5
3 % 11 = 3.6666666666666665
4 % 11 = 2.75


2 % 11 = 5.5
3 % 11 = 3.6666666666666665
4 % 11 = 2.75
5 % 11 = 2.2
6 % 11 = 1.8333333333333333
7 % 11 = 1.5714285714285714
8 % 11 = 1.375
9 % 11 = 1.2222222222222223
10 % 11 = 1.1
false




* */