package DSA.Bitwise;

public class magicnumber {

    public static void main(String[] args) {
        // 1st magic number = 5^3*0 + 5^2*0 + 5^1*1 = 5  so powers of 5 with binary form of integer 1 

        int n   = 6;
        System.out.println(magic(n));

    }

    public static int magic(int n)
    {
       int base = 5;
       int ans = 0;

       while (n>0) {
        ans += (n&1)*base;
        base = base*5;
        n>>=1;
        
       }
       return ans;
    }
    
}
