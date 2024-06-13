package DSA.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class setmismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    
    public static int[] findErrorNums(int[] nums) {
        List<Integer> list = new ArrayList<>(1);

        int i =0; 
        while(i<nums.length)
        {
            int temp = 0;
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
        
            
            else i++;
        }
          
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j]!=j+1){
                list.add(nums[j]);
                list.add(j+1);
            }
        }
        int[] arr = new int[list.size()];
        for(int j = 0; j<arr.length; j++){
            arr[j]=list.get(j);
        }
         return arr;

    }
}
