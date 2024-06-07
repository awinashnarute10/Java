package DSA.Searching;
import java.util.*;
public class firstandlast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
     
    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0]=first(nums, target);
        ans[1]=last(nums, target);
        return ans;
    }

    public static int first(int[] nums, int target)
    {
        int s =0, e = nums.length-1;
        int f=-1;

        while (s<=e) {
            int mid = s+(e-s)/2;
            if(nums[mid]>=target)
            {
                e = mid-1;
                 f=mid;
            }
            else{
                s=mid+1;
            }
            // if(nums[mid] == target) f = mid;
        }
        return f;
    }

    public static int last(int[] nums, int target)
    {
        int s=0, e=nums.length-1;
        int l=-1;

        while (s<=e) {
            int mid = s+(e-s)/2;
            if(nums[mid]<=target)
            {
                s = mid+1;
                l=mid;
            }
            else{
                e=mid-1;
            }
            // if(nums[mid] == target) l = mid;
        }
        return l;
    }
}
