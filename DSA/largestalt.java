package DSA;

import java.util.Arrays;

public class largestalt {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int[] alt = new int[gain.length+1];
         for (int i = 1; i < alt.length; i++) {
            alt[i]= alt[i-1]+gain[i-1];

         }
    int max = Arrays.stream(alt).max().getAsInt();
    System.out.println(max);
    System.out.println(Arrays.toString(alt));
    }
    
}
