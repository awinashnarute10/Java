package DSA.recursion;

public class poweroftwo {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPowerOfTwo(n));

    }
    
    public static boolean isPowerOfTwo(int n) {
        if(n==1)
        {
         return true;
        }
        if(n%2!=0)
        {
         return false;
        }
 
        return isPowerOfTwo(n/2);
     }
}
