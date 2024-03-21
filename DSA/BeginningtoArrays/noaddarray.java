package DSA.BeginningtoArrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class noaddarray {
    public static void main(String[] args) {
        double [] arr = {9,9,9,9,9,9,9,9,9,9,9};
         int k =1;
double s =0;
         for(int i = 0; i<arr.length; i++)
         {
            s = s*10+arr[i];
         }
         s+=k;

         List <Double> bs = new ArrayList<>();
         int i = 0;
         while(s!=0)
         {
            
            bs.add(s%10);
            s/=10;
         }
         Collections.reverse(bs);
         System.out.println(bs);
    
}
}