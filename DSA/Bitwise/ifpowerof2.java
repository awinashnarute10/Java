package DSA.Bitwise;

public class ifpowerof2 {

    public static void main(String[] args) {
        int n = 15; // true iits power of 2

        boolean ans = (n&(n-1))==0; // a power of two is always in the form 1 with trailing zeroes only and a number less than it is always 11111 therefore anding will always give zero
        System.out.println(ans);

    }
    
}
