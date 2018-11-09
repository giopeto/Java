package datastructures.banas.hashtables;

import java.util.Arrays;

public class HashFunction {

    String[] hashFunctionArray;
    int size;

    public HashFunction(int size) {
        hashFunctionArray = new String[size];
        this.size = size;
        Arrays.fill(hashFunctionArray, "");
    }

    private String[] hashFunction(String[] elementsToAdd, String[] array) {
        for(String el: elementsToAdd) {
            array[Integer.parseInt(el)] = el;
        }

        return array;
    }

    private String[] hashFunction1(String[] elementsToAdd, String[] array) {
        for(String el: elementsToAdd) {
            int index = Integer.parseInt(el) % (this.size-1);

            System.out.println("Modulus index " + index + " for value " + el);

            while(array[index] != "") {
                index++;
                System.out.println("Colision. Try " + index + " instead");
                index = index % array.length;
            }

            array[index] = el;
        }

        return array;
    }

    public String findKeyByValue(String val) {
        int index = Integer.parseInt(val) % (this.size-1);

        while(hashFunctionArray[index] != "") {
            if(hashFunctionArray[index].equals(val)) {
                System.out.println(val + " was found in index " + index);
                return hashFunctionArray[index];
            }
            index++;
            index = index % hashFunctionArray.length;
        }

        return null;
    }

    private static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Integer.toString(i) + " : " + array[i]);
        }
    }

    public static void main(String[] args) {
        HashFunction hashTable = new HashFunction(5);

        String[] array = hashTable.hashFunction1(new String[]{"111", "222", "333", "4234", "5234"}, hashTable.hashFunctionArray);
        print(array);

        hashTable.findKeyByValue("111");

    }
}
