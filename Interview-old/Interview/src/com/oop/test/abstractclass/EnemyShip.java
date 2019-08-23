package com.oop.test.abstractclass;

/**
 * Created by George on 19.2.2017 г..
 */
public abstract class EnemyShip {

	private String name;
	private Double damage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDamage() {
		return damage;
	}

	public void setDamage(Double damage) {
		this.damage = damage;
	}

	public String printMsg() {
		return "I am a enemy ship";
	}

}
