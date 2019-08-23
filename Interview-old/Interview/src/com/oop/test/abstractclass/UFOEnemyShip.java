package com.oop.test.abstractclass;

/**
 * Created by George on 19.2.2017 г..
 */
public class UFOEnemyShip extends EnemyShip{

	UFOEnemyShip(){
		setName("UFOEnemyShip");
		setDamage(20.00);
	}

	public String printMsg() {
		return super.printMsg(); // Or just remove this line
	}

}
