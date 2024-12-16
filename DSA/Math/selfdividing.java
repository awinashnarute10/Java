package DSA.Math;

import java.util.ArrayList;
import java.util.List;

public class selfdividing {

    public static void main(String[] args) {

        int left = 1, right =22;
        System.out.println(selfDividingNumbers(left, right));
        
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> li = new ArrayList<>();
         
         for(int i = left; i<=right; i++)
         {
             if(isDividing(i))
             {
                li.add(i);
             }
         }
         return li;

    }
    public static boolean isDividing(int i)
    {
        int temp = i;
        while(i!=0)
        {
             if(i%10==0||temp%(i%10)!=0)
             {
                return false;
             }
             
             i/=10;
        }
        return true;
    }

    
}
