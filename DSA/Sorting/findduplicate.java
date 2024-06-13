package DSA.Sorting;

// import java.util.Arrays;

public class findduplicate {
    // https://leetcode.com/problems/find-the-duplicate-number/description/
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    
    public static int findDuplicate(int[] nums) {
        // int[] arr = new int[nums.length];

        // Arrays.sort(nums);

        // for(int i : nums)
        // {
        //     arr[i-1]++;
        // }
        // for(int j = 0; j<arr.length; j++)
        // {
        //     if(arr[j]>1)
        //     {
        //         return j+1;
        //     }
        // }
        // return 0;

        // cycle sort
        int i =0;
        while(i<nums.length)
        {
            int temp = 0; 
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]= temp;
            }
            else if(nums[i]==nums[correct]&&i!=correct)
            {
                return nums[i];
            }
            else i++;
        }

        for(int j = 0; j<nums.length; j++)
        {
            if(nums[j]!=j+1)
            {
                return nums[j];
            }
        }
        return 0;
    }
}
