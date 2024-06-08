package DSA.Sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
       
        for(int i = 0; i<arr.length-1; i++)
        {
            int temp = 0, max = arr.length-i-1;
            boolean flag = false;

            for(int j = 0; j<arr.length-i-1; j++)
            {
                if(arr[max]<arr[j])
                {
                    max = j;
                    flag = true;
                }
            }

        if (flag) {
            temp = arr[arr.length-i-1];
                arr[arr.length-i-1]=arr[max];
                arr[max] = temp;
        }
            
        }

        System.out.println(Arrays.toString(arr));
       
    }
    
}
