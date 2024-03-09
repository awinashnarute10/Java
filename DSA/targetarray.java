package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class targetarray {
    public static void main(String[] args) {

        int[] num = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] target = new int[5];

    //     for (int i = 0; i < target.length; i++) {
    //         if (index[i] < i) {
    //             int pos = index[i];
    //             int[] a = new int[target.length]; 

                
    //             for (int j = 0; j <= pos; j++) {
    //                 a[j] = target[j];
    //             }

               
    //             a[pos + 1] = num[i];

                
    //             for (int j = pos + 2; j < a.length; j++) {
    //                 a[j] = target[j - 1];
    //             }

                
    //             for (int j = 0; j < a.length; j++) {
    //                 target[j] = a[j];
    //             }
    //         } else {
    //             target[index[i]] = num[i];
    //         }
    //     }

    //     System.out.println(Arrays.toString(target));

    // Leetcode solution
     ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<num.length;i++)
        {
            a.add(index[i],num[i]);
        }
        
        for(int i=0;i<num.length;i++)
        {
            target[i] = a.get(i);
        }
        System.out.println(Arrays.toString(target));
     }
}
