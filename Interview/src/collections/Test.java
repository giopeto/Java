package collections;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        map();
        //list();
        //set();

    }


    private static void set() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        if(set.contains(2)) {
            set.remove(2);
        }
        System.out.println(set);
        int sum = set.stream()
                .filter(i -> i>2)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    private static void list() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.get(0);
        list.remove(list.get(2));
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        int x = list.stream()
                .filter(i -> i>3)
                .map(i -> i*10)
                .mapToInt(Integer::intValue).sum();
        System.out.println(x);

        list.forEach(e -> System.out.print(e + " "));
    }


    private static void map() {
        Map<Integer, Integer> map = new HashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        for(int x : new int[]{1,2,6}) {
            System.out.println("Get " + x + " " + map.get(x));
            if(map.containsKey(x) && map.get(x) > 15) {
                map.remove(x);
            }
        }

        System.out.println(map);
        map.forEach((k, v) -> System.out.print(k + ":" + v + " "));
        System.out.println("stream");
        map.entrySet().stream().forEach(System.out::println);
    }
}
