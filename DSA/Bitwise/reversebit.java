package DSA.Bitwise;

public class reversebit {

    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i<32; i++)
        {
            int bit = (n&1);
            ans = (ans<<1)|bit;
            n>>>=1;
        }
        return ans;
    }
    
}
