package datastructures.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        Map<MapKeyObject, Integer> mapWithObjectAsKey = new HashMap<>();

        MapKeyObject key1 = new MapKeyObject("1");
        mapWithObjectAsKey.put(key1, 111);

        System.out.println(mapWithObjectAsKey.get(key1));
        key1.setKey("2");
        System.out.println(mapWithObjectAsKey.get(key1));

        System.out.println("Foreach");
        mapWithObjectAsKey.forEach((v, k) -> System.out.println(v.toString()));
    }


    private static class MapKeyObject{
        public String key;

        MapKeyObject(String key) {
            this.key = key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return this.key;
        }

        @Override
        public int hashCode() {
            return Integer.parseInt(this.key);
        }
    }
}
