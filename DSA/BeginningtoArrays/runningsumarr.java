package DSA.BeginningtoArrays;

import java.util.Arrays;

public class runningsumarr {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningsum1(nums)));
        
    }
    public static int[] runningsum1(int[] nums)
    {
        //    int[] runningSum = new int[nums.length];
        //     for(int i=0; i<nums.length; i++)
        //     {
        //         runningSum[i]=0;
        //         for (int j = 0; j <=i; j++) {
        //             runningSum[i]=runningSum[i]+nums[j];

        //         }
        //     }
        
        //         return runningSum;

                // /*
                //  * leet code solution
         for(int i=1; i<nums.length;i++)
             {
                    nums[i]=nums[i-1]+nums[i];
                 }
                
                 return nums;
              
    }
    
}
