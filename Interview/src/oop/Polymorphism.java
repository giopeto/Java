package oop;

/*
* Polymorphism is the ability of an object to take on many forms.
* The most common use of polymorphism in OOP occurs when a
* parent class reference is used to refer to a child class object.
* */
public class Polymorphism {

    Deer deer = new Deer();
    AnimalPolymorphism animal = deer;
    Vegetarian vegetarian = deer;

}


interface Vegetarian{}
class AnimalPolymorphism{}
class Deer extends AnimalPolymorphism implements Vegetarian{}