package algorithms.cpfromothertest.newspace.algorithms.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

// https://leetcode.com/problems/3sum/
public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threesSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }


    public static List<List<Integer>> threesSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            map.put(i, nums[i]);
        }

        System.out.println(map);

        for (int i=0; i< nums.length; i++) {
            int complement = 0 - map.get(i);
            List<Integer> skipElements = new ArrayList<>();
            skipElements.add(0);
            List res = findComplements(map, skipElements, complement);
            if(res.size() > 0) {
                result.add(res);
            }
        }

        return result;
    }

    private static List<Integer> findComplements(Map<Integer, Integer> map, List<Integer> skipElements, int complement) {
        for(int mKey: map.keySet()) {
            if(!skipElements.contains(mKey)) {
                complement -= map.get(mKey);
                if(skipElements.size() == 2 && complement == 0) {
                    return asList(map.get(mKey), map.get(skipElements.get(0)), map.get(skipElements.get(1)));
                } else {
                    skipElements.add(mKey);
                    return findComplements(map, skipElements, complement);
                }
            }
        }
        return asList();
    }

}
