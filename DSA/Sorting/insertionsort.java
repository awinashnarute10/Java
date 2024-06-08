package DSA.Sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};

        for(int i = 0; i<arr.length-1; i++)
        {
            for (int j = i+1; j > 0; j--) {
                int temp=0;
                   if(arr[j]<arr[j-1])
                   {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                   }
                   else break;
                
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
