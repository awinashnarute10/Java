package DSA.Sorting;

import java.util.Arrays;

public class majorityelement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
     public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        // if a element appears more than n/2 times then it definetly appears in the middle
        // of sorted array

        return nums[nums.length/2];
    }
}
