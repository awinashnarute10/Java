package DSA.Searching;

public class isperfectsquare {
    public static void main(String[] args) {
        int num = 16;
System.out.println(isperfect(num));
    }
  
    static boolean isperfect(int num)
    {
        int s = 1;
        int e = num;
        
        while(s<=e)
        {
            int mid = s+(e-s)/2;

            if((long)mid*mid==(long)num)
            {
                return true;
            }
            else if((long)mid*mid>(long)num)
            {
                e=mid-1;
            }
            else if((long)mid*mid<(long)num)
            {
                s=mid+1;
            }
        }
          
        return false;

    }
}
