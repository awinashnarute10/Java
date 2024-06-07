package DSA.Sorting;

import java.util.Arrays;

public class missingnumber {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        //  if(nums.length>=1&&nums[0]!=0)
        // {
            // return 0;
        // }
        // for(int i = 1; i<=nums.length; i++)
        // {
        //     if(nums[i]==nums[i-1]+1)
        //     {
        //         continue;
        //     }
        //     else
        //     {
        //         return nums[i]-1;
        //     }
        // }
        // return -1;

        // XOR method
        int res = nums.length;
    for(int i=0; i<nums.length; i++){
        res ^= i;
        res ^= nums[i];
    }
    return res;
    }
}
