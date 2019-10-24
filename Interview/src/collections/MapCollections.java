package collections;

import java.util.*;

public class MapCollections {

    public static void main(String[] args) {

        // Key value
        // Key is unique. Only one can be null
        // Values are not unique

        Map<Integer, Integer> hash = new HashMap(); // no order
        Map<Integer, Integer> linked = new LinkedHashMap<>(); // insertion order
        Map<Integer, Integer> tree = new TreeMap<>(); // natural order

        addToMap(hash, "HashMap");
        addToMap(linked, "LinkedHashMap");
        addToMap(tree, "TreeMap");


        String s1 = "Test";
        String s2 = "Test";

    }


    public static void addToMap(Map map, String type) {
        map.put(250, 2.5);
        map.put(100, 1);
        map.put(200, 2);
        map.put(400, 3);
        map.put(300, 4);

        map.put(200, 2000);

        System.out.println(map + " " + type);
    }
}
