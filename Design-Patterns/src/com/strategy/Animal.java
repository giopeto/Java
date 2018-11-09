package com.strategy;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String sound;
    public Flys flyingType;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight>0){
            this.weight = weight;
        }else{
            System.out.println("Weight can't be zero.");
        }

    }

    public Flys getFlyingType() {
        return flyingType;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }

    public String tryToFly() {
        return flyingType.fly();
    }
}
