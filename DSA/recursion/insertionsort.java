package DSA.recursion;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,8};
        
        int n = arr.length;
        int i = 1;

        System.out.println(Arrays.toString(sort(arr, n, i)));
        
    }

    public static int[] sort(int[] arr, int n, int i)
    {
        if(i>=n)
        {
            return arr;
        }
        int key = arr[i];
        int j = i-1;

        while (j>=0 && arr[j]>key) {
            arr[j+1] = arr[j];
            j--;
            
        }
        arr[j+1] = key;

        return sort(arr, n, i+1);
    }
    
} 
