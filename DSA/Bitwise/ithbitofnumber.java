package DSA.Bitwise;

public class ithbitofnumber {

    public static void main(String[] args) {
        int n = 0b10110110;
        
        int bit = 5;
        System.out.println(ans(n, bit));

        // now to set 0 bit to 1 by or it with 1 
        n = setbitto1(n, bit);
        System.out.println(ans(n, bit+2));


        // set 1 to 0 ith bit by and it with 0
         n = setbitto0(n, bit);
         System.out.println(ans(n, bit+2));
       

    }
    
    public static int ans(int n, int bit)
    {
        return (n&(1<<(bit-1)))!=0?1:0;  // this is called mask
    }

    public static int setbitto1(int n, int bit)
    {
        return n^(1<<(bit+1));
    }

    public static int setbitto0(int n, int bit)
    {
        return n&(~(1<<(bit+1)));
    }
}
