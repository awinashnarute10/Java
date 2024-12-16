package DSA.Math;

public class gcd_lcm {

    public static void main(String[] args) {
        int a = 3, b = 33;
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    public static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a, a);
    }

    public static int lcm(int a, int b)
    {
       
        return a*b/gcd(a, b);      // a*b/hcf of a*b
    }
    
}
