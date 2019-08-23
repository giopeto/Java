package com.oop.test.abstractclass;

/**
 * Created by George on 19.2.2017 г..
 */
public class BigUFOEnemyShip extends UFOEnemyShip{
	BigUFOEnemyShip(){
		setName("BigUFOEnemyShip");
		setDamage(40.00);
	}

	public String printMsg() {
		return "I am a Big UFO enemy ship";
	}

}
