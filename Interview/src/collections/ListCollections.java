package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollections {

    public static void main(String[] args) {
        // Store elements one after the other in memory.
        // When need to grow create new array with size 2X old array size and copy old array into new array
        // Search: O(1)
        // Deletion: O(n) in worst case, O(1) when delete last element //  In ArrayList all the elements need to be shifted to fill out the space created by removed element.
        // Inserts Performance: O(n) in worst case because elements need to be shifted
        List<String> test = new ArrayList<>();
        test.add("1");
        test.add(1, "new");
        String  asd = test.get(1);

        System.out.println(test);
        System.out.println(test.indexOf("new1"));


        // Store elements in first empty slot in memory.
        // Each element is linked to previous and next element (doubly linked list)
        // Adding elements are easy
        // Search: O(n)
        // Deletion: O(1) // Removal only requires change in the pointer location in the two neighbor nodes (elements) of the node which is going to be removed
        // Inserts Performance: O(1)
        List<Integer> linked = new LinkedList<>();
        linked.add(1);
        linked.add(2);
        linked.get(1);

        // Memory Overhead: ArrayList maintains indexes and element data while
        // LinkedList maintains element data and two pointers for neighbor nodes hence the memory consumption is high in LinkedList comparatively.

        // They both maintain the elements insertion order which means while displaying ArrayList and LinkedList
        // elements the result set would be having the same order in which the elements got inserted into the List
    }



    public static class Dog {
        public String name;

        public Dog(String name) {
            this.name = name;
        }
    }

}
