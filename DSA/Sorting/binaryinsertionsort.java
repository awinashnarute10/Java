package DSA.Sorting;

import java.util.Arrays;

public class binaryinsertionsort {

    public static void main(String[] args) {

        int[] arr = {5,3,4,1,2};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int pos = bs(arr, key, 0, i-1);
   
            for (int j = i; j>pos; j--) {
                arr[j] = arr[j-1];
            }
            arr[pos] = key;


        }

        System.out.println(Arrays.toString(arr));
        
    }

    public static int bs(int[] arr, int key, int low, int high)
    {
           while (low<=high) {
            int mid = low+(high-low)/2;
           
            if(arr[mid]<=key)
            {
                low=mid+1;
            }
            else{
                high = mid-1;
            }
            
            
           }
           return low;
    }
    
}
