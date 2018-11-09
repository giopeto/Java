package oop;

public class Overloading {

    public static void main(String[] args) {
        OverloadingTest overloadingTest = new OverloadingTest();
        overloadingTest.add(1, 2);
        overloadingTest.add(3, 4, 5);
    }
}

class OverloadingTest {

    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        System.out.println("Overload add with third z parameter");
        return x + y +z;
    }

    public int add(int x, double y) {
        System.out.println("Overload add with different data type");
        return new Double(x + y).intValue();
    }
}
