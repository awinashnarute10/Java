package DSA;

public class findevennodig {
    public static void main(String[] args) {
        
      int [] nums = {12,345,2,6,7896};
      int dig=0;
        for(int i = 0; i<nums.length; i++)
        {
            int num = nums[i];
            int count =0;
            while(num!=0)
            {
                num/=10;
                ++count;
            }
            if(count%2==0)
            {
                dig++;
            }
        }
        System.out.println(dig);
    }
    
}
