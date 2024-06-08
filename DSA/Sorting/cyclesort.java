package DSA.Sorting;

import java.util.Arrays;

public class cyclesort {

    // only for sorting the numbers of range 1-N 
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
int i = 0;
         while(i < arr.length) {
            int temp = 0;
            if (arr[i]!=i+1) {
                temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
                
            }
            else i++;
            
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
