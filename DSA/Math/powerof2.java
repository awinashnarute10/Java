package DSA.Math;

public class powerof2 {

    public static void main(String[] args) {
        int n = 16;

        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        while(n>0)
        {
         if(n==1)
         {
             return true;
 
         }
         if(n%2!=0)
         {
             return false;
         }
         n = n/2;
        }
        return false;
    } 
    
}
