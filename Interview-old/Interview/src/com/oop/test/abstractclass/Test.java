package com.oop.test.abstractclass;

/**
 * Created by George on 19.2.2017 г..
 */
public class Test {

	public static void main(String[] args) {

		EnemyShip es = new UFOEnemyShip();
		System.out.println(es.getName());
		System.out.println(es.printMsg());
		System.out.println("****************************");

		es = new BigUFOEnemyShip();
		System.out.println(es.getName());
		System.out.println(es.printMsg());
		System.out.println("****************************");

	}
}
