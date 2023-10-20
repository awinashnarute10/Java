package DSA;

import java.util.Scanner;

public class zerobasedpermutation {
    public static void main(String[] args) {
        int [] nums = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<6; i++)
        {
            nums[i]= sc.nextInt();
        }
        sc.close();
       int [] ans = new int[5];
       ans = arr(nums);
       for(int a : ans)
       {
        System.out.println(a);
       }
    }
    public static int[] arr(int[] nums)
    {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
            
        }
        return ans;
        
    }
}
