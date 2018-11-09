package collections;

import java.util.*;

public class MapCollections {

    public static void main(String[] args) {

        // Key value
        // Key is unique. Only one can be null
        // Values are not unique

        Map<Integer, Integer> hash = new HashMap(); // no order
        Map<Integer, Integer> tree = new TreeMap<>(); // natural order
        Map<Integer, Integer> linked = new LinkedHashMap<>(); // insertion order

        addToMap(hash);
        addToMap(tree);
        addToMap(linked);

    }


    public static void addToMap(Map map) {
        map.put(100, 1);
        map.put(200, 2);
        map.put(400, 3);
        map.put(300, 4);


        System.out.println(map);
    }
}
