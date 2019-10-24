package algorithms.cpfromothertest.newspace.algorithms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {
        /*System.out.println(Arrays.toString(
                twoSum(new int[]{3,2,4}, 6)
        ));*/

        System.out.println(Arrays.toString(
                twoSumHashSolution(new int[]{3,2,4}, 6)
        ));

    }

    private static int[] twoSumHashSolution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < nums.length; i++) {
            int neededNum = target - nums[i];
            if(map.containsKey(neededNum)) {
                return new int[]{map.get(neededNum), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static  int[] twoSum(int[] nums, int target) {
        for(int i =0; i < nums.length; i++) {
            for(int j = i+1; j <nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
