package algorithms.cpfromothertest.newspace.algorithms.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }

    private static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[lastNonZeroIndex++] = nums[i];
            }
        }

        for(int i = lastNonZeroIndex; i< nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

}
