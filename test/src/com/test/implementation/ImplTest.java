package com.test.implementation;


import com.test.implementation.array.MyArray;

public class ImplTest {

    public static void main(String[] args) {
        testMyArray();
    }

    private static void testMyArray() {
        MyArray myArray = new MyArray(Integer.class);
        for(int i=0; i< 5; i++) {
            myArray.insert(i+1);
        }
        myArray.print();
    }
}
