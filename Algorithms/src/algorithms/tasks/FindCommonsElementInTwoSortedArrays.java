package algorithms.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCommonsElementInTwoSortedArrays {


    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        int[] b = new int[]{1,2,3,4, 6};

        Map<Integer, Integer> map = new HashMap<>();

        int biggestNumber = a.length > b.length ? a[a.length - 1] : b[b.length - 1];

        map = getCommonsToMap(map, a, biggestNumber);
        map = getCommonsToMap(map, b, biggestNumber);

        List<Integer> result = new ArrayList<>();

        List<Integer> result2 =  map.entrySet().stream()
                .filter(e -> e.getValue() == 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        map.forEach((k, v) -> {
            if(v == 2) {
                result.add(k);
            }

        });

        System.out.println(result + " " + result2);
    }

    private static Map<Integer, Integer> getCommonsToMap(Map<Integer, Integer> map, int[] arr, int biggestNumber) {
        System.out.println(map);
        for(int i = 0; i< arr.length; i++) {
            if (arr[i] > biggestNumber) {
                break;
            }
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map;
    }
}
