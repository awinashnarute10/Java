package DSA.Sorting;

public class sqrt {
    public static void main(String[] args) {
        int x = 8;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        if(x==1)
        {
            return 1;
        }
      
       int start = 1, end = x;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if (mid*mid<x) {
                start = mid+1;
                
            }
            else if (mid*mid>x) {
                end = mid-1;
                
            } 
            else if (mid*mid==x) {
                return mid;
                
            }
        }
       return end;
    }
}
