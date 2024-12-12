package DSA.Bitwise;

import java.util.Arrays;

public class sortingbybits {

    public static void main(String[] args) {
        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
         
        System.out.println(Arrays.toString(sortByBits(arr)));
    }

     public static int[] sortByBits(int[] arr) {
        
        Arrays.sort(arr);

        for(int i = 0 ; i<arr.length; i++)
        {
            arr[i] = countbits(arr[i])*10001 + arr[i];
        }
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = arr[i]%10001;
        }
        return arr;
        
    }

    public static int countbits(int n)
    {
        int count = 0;
        while(n>0)
        {
            n= n-(n&(-n));
            count++;
        }
        return count;
    }
    
}
