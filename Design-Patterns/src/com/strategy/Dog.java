package com.strategy;


public class Dog extends Animal{

    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CantFlys();
    }

    public void digHole(){
        System.out.println("Dog dig a hole");
    }

}
