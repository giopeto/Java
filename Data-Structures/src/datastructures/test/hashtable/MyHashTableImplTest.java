package datastructures.test.hashtable;

import java.util.ArrayList;

public class MyHashTableImplTest {

    public static void main(String[] args) {

        MyHashTable<Integer, Integer> myHashTable = new MyHashTableImpl<>();

        int testSize = 100;
        for (int i = 1; i <= testSize; i++) {
            myHashTable.add(i, i);
        }
        ArrayList list = new ArrayList();
       /* for (int i = 1; i <= testSize; i++) {
            list.add(myHashTable.get(i));
            System.out.println(myHashTable.get(i));
        }*/
        System.out.println("Size: " + list.size());

        /*myHashTable.add(10, "First 2");
        myHashTable.add(10, "First");
        myHashTable.add(11, "Second");
        myHashTable.add(20, "Third same with first");

        myHashTable.get(20);
        myHashTable.remove(40);*/
        System.out.println(myHashTable.get(1));
        myHashTable.print();
    }
}
