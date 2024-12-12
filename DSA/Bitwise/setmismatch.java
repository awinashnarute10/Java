package DSA.Bitwise;

import java.util.Arrays;

public class setmismatch {

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        int duplicate = 0;
        int error = 0;

        for(int i =0; i<nums.length; i++)
    {
        if(arr[nums[i]]==true)
        {
             duplicate = nums[i];
             

        }
        else{
            arr[nums[i]] = true;
        }
    }
    for(int i = 0; i<arr.length; i++)
    {
        if(arr[i]==false)
        {
            error = i;
        }
    }

    return new int[] {duplicate,error};

    }
    
}
