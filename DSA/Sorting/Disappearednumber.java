package DSA.Sorting;

import java.util.*;

public class Disappearednumber {
    public static void main(String[] args) {
        int[] nums  = {4,3,2,7,8,2,3,1};
          System.out.println(findDisappearedNumbers(nums));
    }
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>(10);

        // Arrays.sort(nums);
        // int[] arr = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     arr[nums[i] - 1] = 1;
        //     if (arr[i] == 0)
        //         list.add(i + 1);

        // }
        // return list;

        // Cycle sort
        int i = 0;
         while(i < nums.length) {
            int temp = 0;
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]) {
                temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
                
            }
            else i++;
            
        }
        for(int j = 0; j<nums.length; j++)
        {
            if(nums[j]!=j+1)
            {
                list.add(j+1);
            }
        }

        return list;
         

    }
}
