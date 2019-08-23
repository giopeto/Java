package com.george.com;

/**
 * Created by George on 19.2.2017 г..
 */
public class CheckHowManyPrimeNumberIs {
	public static void main(String[] args) {
		int n = 2;
		int isPrime = check(n);
		System.out.println(isPrime);
	}

	private static int check(int n) {

		int sum = 0;

		if(n<2){
			return sum;
		}

		for(int i=2; i<=n; i++){
			if(checkIsPrime(i)){
				sum++;
			}
		}



		return sum;

	}

	private static boolean checkIsPrime(int n) {
		//System.out.println("****************************: " + pn);

		//check if n is a multiple of 2
		if (n%2==0) return false;
		//if not, then just check the odds
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		System.out.println("PRIME: " + n);
		return true;

		/*if (n<2){
			return false;
		}



		*//*for(int i=2; i<pn; i++){
			System.out.println(i + " % " + pn + " = " + (double)pn/i);
			if(pn%i==0){
				return false;
			}
		}*//*
		*//*System.out.println("****************************");*//*
		//for(int i=2; i*2<pn; i++){
			for(int i=2;2*i<n;i++) {
			//System.out.println(i + " % " + pn + " = " + (double)pn/i);
			if(n%i==0){
				return false;
			}
		}
		System.out.println("PRIME: " + n);
		return true;*/
	}

}
