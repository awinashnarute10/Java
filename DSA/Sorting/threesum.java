package DSA.Sorting;

import java.util.*;

public class threesum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);

        // for (int i = 0; i < nums.length - 2; i++) {
        //     for (int j = i + 1; j < nums.length - 1; j++) {

        //         for (int k = j + 1; k < nums.length; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 list.add(Arrays.asList(nums[i],nums[j], nums[k]));
                        
        //             }
        //         }
        //     }
        // }

        for(int i = 0; i<nums.length-2; i++)
         {
            int j = i+1;
            int k = nums.length-1;
              while(j<k)
              {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum>0)
                {
                    k--;
                }
                else j++;
              }

         }
        return new ArrayList<>(list);

    }
}
