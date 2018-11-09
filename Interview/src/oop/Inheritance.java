package oop;

/*
*
* Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.
* With the use of inheritance the information is made manageable in a hierarchical order.
* */
public class Inheritance {

    public static void main(String[] args) {
        Child child = new Child();
        child.printFromSupper();
        child.setSuperVar(8);
        child.printFromSupper();
    }
}

class SuperClass {

    private int superVar = 1;

    public void printFromSupper() {
        System.out.println("printFromSupper " + superVar);
    }

    public void setSuperVar(int superVar) {
        this.superVar = superVar;
    }
}

class Child extends SuperClass {}
