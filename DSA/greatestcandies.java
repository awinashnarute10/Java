package DSA;

import java.util.*;


public class greatestcandies {
    public static void main(String[] args) {
    int [] candies = {2,3,5,1,3};
    int extraCandies = 3;

        //     int temp  = 0;
        //     int max = 0;
        // for(int i = 0; i<candies.length; i++)
        // {
        //     for(int j = i+1; j<candies.length; j++)
        //     {
        //         temp = 0;
        //         if(candies[j]>candies[i])
        //         {
        //             temp = candies[j];
        //             break;
                    
        //         }
        //     }
        //     if(temp>max)
        //     {
        //         max = temp;
        //     }
        // }
        // System.out.println(max);

        ArrayList<Boolean> result = new ArrayList<>(candies.length);
        // for(int i=0; i<candies.length; i++)
        // {
        //     result.add(candies[i]+extraCandies>=max);
        // }
        // System.out.println(result);

        //leetcode sol
            int max =0;
        for (int i : candies) {
            max = Math.max(i,max);
        }
    for (int i : candies) {
        result.add(i+extraCandies>=max);
    }
  System.out.println(result);
        
    }
    
}
