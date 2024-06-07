package DSA.Sorting;
import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3};
        
        for (int i = 0; i <= arr.length-2; i++) {
            int x = 0;
            int temp=0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                       temp = arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                       x++;
                    
                }
                
            }
            if(x==0) break;
            
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
