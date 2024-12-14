package DSA.Bitwise;

import java.util.Arrays;

public class decodexor {

    public static void main(String[] args) {
        int[] encoded = {6,2,7,3}; 
        int first = 4;

        System.out.println(Arrays.toString(decode(encoded, first)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] original = new int[encoded.length + 1];

        original[0] = first;
        for (int i = 1; i < original.length; i++) {
            original[i] = encoded[i - 1] ^ original[i - 1];
        }
        return original;
    }
    
}
