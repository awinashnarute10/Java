package DSA.Sorting;

public class searchinsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(search(nums, target));
    }
    static int search(int[] nums, int target)
    {
        int s = 0;
        int e = nums.length-1;

        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                s=mid+1;
            }
            else if(target<nums[mid])
            {
                e=mid-1;
            }
        }
        return s;
    }
}
