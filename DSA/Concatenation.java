package DSA;

import java.util.Arrays;

public class Concatenation {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i = 0; i<nums.length; i++)
        {
          ans[i]= ans[i+nums.length]=nums[i];
        }
       
        return ans;
//         if(nums.length<1)
//         return nums;

//     int ans[]=new int[nums.length*2];

//     for(int i=0;i<nums.length*2;i++){
//         if(i<nums.length){
//             ans[i]=nums[i];
//         }else
//         {
//             ans[i]=nums[i-nums.length];
//         }
//     }
// return ans;

    }

    public static void main(String[] args)
    {
          int[] nums = {1,2,3,4,5};
          System.out.println(Arrays.toString(getConcatenation(nums)));
          

    }
}