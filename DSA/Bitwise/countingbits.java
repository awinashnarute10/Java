package DSA.Bitwise;

import java.util.Arrays;

public class countingbits {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));

    }

    public static int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int i = 0; i<n+1; i++)
        {
            arr[i] = bits(i);
        }
        return arr;
    }

    public static int bits(int i){
        int count = 0;
        while(i>0)
        {
            i = i-(i&(-i));
            count++;
        }
        return count;
    }
    
}
