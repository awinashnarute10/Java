package DSA.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findduplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>(19);
        // int[] arr =  new int[nums.length+1];
        //    Arrays.sort(nums);
        //   for(int i : nums)
        //  {
        //    arr[i-1]++;
        // }
        // for(int j = 0; j<arr.length; j++)
        // {
        //     if(arr[j]>1)
        //     {
        //         list.add(j+1);
        //     }
        // }
        // return list;

        // cycle sort
        int i =0;
        while(i<nums.length)
        {
            int temp= 0;
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                temp = nums[i];
                nums[i] = nums[correct];
                nums[correct]=temp;
            }
            
            else i++;
        }
          for(int j =0; j<nums.length; j++)
          {
            if(nums[j]!=j+1)
            list.add(nums[j]);
          }

        return list;
           
    }
}
