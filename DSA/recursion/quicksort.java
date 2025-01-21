package DSA.recursion;

import java.util.Arrays;

public class quicksort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quicksort1(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quicksort1(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e  = high;
        int mid = low+(high-low)/2;
        int pivot = arr[mid];

        while(s<=e){
            while(arr[s]<arr[pivot]){
                s++;
            }
            while(arr[e]>arr[pivot]){
                e--;
            }

            if(s<=e){  // entering this means locha has happened 
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;

            }
        }

        quicksort1(arr, low, e);
        quicksort1(arr, s, high);

    }
    
}
