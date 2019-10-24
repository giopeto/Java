package algorithms.cpfromothertest.newspace.algorithms.arrays;

// https://leetcode.com/problems/remove-element/
public class RemoveElements {
    public static void main(String[] args) {
        removeElements(new int[]{0,1,2,2,3,0,4,2}, 2);
    }

    private static int removeElements(int[] nums, int val) {
        int i=0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
