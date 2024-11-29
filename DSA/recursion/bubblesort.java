package DSA.recursion;

import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8};
        int n = arr.length;
        int i = 0;
        int j = 1;
        System.out.println(Arrays.toString(sort(arr, n, i, j)));
        System.out.println(Arrays.toString(sort2(arr, n)));
    }
    
    public static int[] sort(int[] arr, int n, int i, int j){
        if(n-i-1==0){
            return arr;
        }
        if(j>n-i-1){
            return sort(arr, n, i+1, 1);
        }
        else{
            
            if(arr[j-1]>arr[j])
            {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                
            }
            return sort(arr, n, i, j+1);
        }

    }

    public static int[] sort2(int[] arr, int n)
    {
        if(n==1)
        {
            return arr;
        }
        boolean sort = false;
          for(int i = 0; i<n-1; i++)
          {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
                sort  =  true;
            }
          }
          if(!sort){
            return arr;
          }

          return sort2(arr, n-1);
          
    }
}
