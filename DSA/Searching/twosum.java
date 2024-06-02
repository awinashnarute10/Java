package DSA.Searching;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int targer = 6;
        System.out.println(Arrays.toString(array(numbers, targer)));
    }
    static int[] array(int[] numbers, int target)
    {
        int[] arr = new int[2];
         
        //  for(int i=0; i<numbers.length-1; i++)          high ms solution
        //  {
        //     for(int j = i+1; j<numbers.length; j++)
        //     {
        //         if(numbers[i]+numbers[j]==target)
        //         {
        //             arr[0]=i+1;
        //             arr[1]= j+1;
        //             return arr;
        //         }
        //     }
        //  }
        // low ms soution
         int s=0, e=numbers.length-1;
         int sum = 0;
         while (s<e) {
               sum = numbers[s]+numbers[e];
               if(sum==target)
               {
                arr[0]= s+1;
                arr[1]= e+1;
                return arr;
               }
               else if(sum>target)
               {
                e--;
               }
               else if(sum<target)
               {
                  s++;
               }
            
         }








         return arr;
        
    }
}
