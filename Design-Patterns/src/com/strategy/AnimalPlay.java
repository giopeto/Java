package com.strategy;

/* Strategy design patterns.
You use this pattern if you need to dynamically change an algorithm used by an object at run time.
The pattern also allows you to eliminate code duplication.
It separates behavior from super and subclasses. */

public class AnimalPlay {
    public static void main (String[] args){
        Animal d = new Dog();
        Animal b = new Bird();

        d.setName("Doggy");
        b.setName("Tweety");

        System.out.println(d.getName() + " " + d.tryToFly());
        System.out.println(b.getName() + " " + b.tryToFly());

        System.out.println("The miracle happens just for the test");
        d.setFlyingType(new ItFlys());
        System.out.println(d.getName() + " " + d.tryToFly());
    }
}
