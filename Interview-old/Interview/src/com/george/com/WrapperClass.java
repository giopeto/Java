package com.george.com;

/**
 * Created by George on 18.2.2017 г..
 */
public class WrapperClass {

	public static void main(String[] args) {
		Integer x = new Integer("55");

		boolean test = x instanceof Integer;

		System.out.println(x + " " + test);


		x = 8;
		System.out.println(x + " " + test);


		int a = 1;
		int b = 2;

		System.out.println("a: "+a+", b: "+b);

		a = b;
		System.out.println("a: "+a+", b: "+b);
		a = 4;
		System.out.println("a: "+a+", b: "+b);

		//System.out.println("a: "+a+", b: "+b);

	}
}
