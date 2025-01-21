package DSA.recursion;

import java.util.Arrays;

public class selectionsort {

    public static void main(String[] args) {
        int[] arr = {1,4,2,7,6,9,8};
         sort(arr, arr.length-1, 0, arr.length-1);
         System.out.println(Arrays.toString(arr));

    }
    
    public static void sort(int[] arr, int i, int j, int max){
          if(i==0)
          {
            return;
          }
          if(j<i){
             if(arr[max]<arr[j])
             {
                sort(arr, i, j+1, j);
             }
             sort(arr, i, j+1, max);
          }
          else{
          int temp = arr[max];
          arr[max]=arr[i];
          arr[i] = temp;
         sort(arr, i-1, 0, i-1);
          }
    }
}
