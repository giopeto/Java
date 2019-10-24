package com.test.implementation.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray<T> {

    private T[] array;
    private int size;

    public MyArray(Class<T> type) {
        this.size = 10;
        array = (T[]) Array.newInstance(type, size);
    }

    public void insert(T element) {
        boolean elementIsSet = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                array[i] = element;
                elementIsSet = true;
                break;
            }
        }

        if(!elementIsSet) {
            makeNewArray();
            this.insert(element);
        }
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }

    private void makeNewArray() {
        this.size *= 2;
        this.array = Arrays.copyOf(this.array, this.size);
    }

}
