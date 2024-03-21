package DSA.BeginningtoArrays;

import java.util.Arrays;

public class smallernumber {

    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        int val;
        int [] result = new int [nums.length];
        
        for(int i =0; i<nums.length; i++)
        {
            val =0;
            for(int j = 0; j<nums.length; j++)
            {
               
                if(nums[i]>nums[j])
                {
                     ++val;
                    
                }
            }
            result[i] = val;

        }
        System.out.println(Arrays.toString(result));
    }
    
}
