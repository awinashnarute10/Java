package DSA.Sorting;

public class firstmissingpositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
         System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int i =0 ;
        while(i<nums.length)
        {
            int temp = 0;
            int c = nums[i]-1;
            if(c>=0&&c<nums.length){
            if(nums[i]!=nums[c])
            {
                temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }
            else i++;
            }
            else i++;
        }
        for(int j =0; j<nums.length; j++)
        {
            if(nums[j]!=j+1) return j+1;
        }
        return nums.length+1;
    }
}
