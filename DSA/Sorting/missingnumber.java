package DSA.Sorting;

import java.util.Arrays;

public class missingnumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
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
// int res = nums.length;
//     for(int i=0; i<nums.length; i++){
//         res ^= i;
//         res ^= nums[i];
//     }
//     return res;


// 0ms own solution
// int[] arr = new int[nums.length+1];
// for(int i : nums)
// {
//     arr[i]=1;
// }
// for(int i=0; i<arr.length; i++)
// {
//     if(arr[i]==0)
//     {
//         return i;
//     }
// }
// return -1;


// cyclic sort solution
 int i = 0;
  while (i<nums.length) {
    int temp = 0; 
    if(nums[i]!=i)
    {
        if(nums[i]>=nums.length)
        {
            i++;
            if(i>=nums.length) break;
        }

        temp = nums[i];
        nums[i] = nums[nums[i]];
        nums[temp] = temp;
    }
    else i++;
  }


for (int j = 0; j < nums.length; j++) {
    if(nums[j]!=j) return j;
}
return nums.length;


    }
}
