package DSA;

import java.util.Scanner;

public class largestandlowest {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int f = sc.nextInt();
       int s = sc.nextInt();
       int t = sc.nextInt();

       int large = largerst(f, s, t);
       int low = lowest(f, s, t);
       System.out.println(large);
       System.out.println(low);
sc.close();
        
    }
    static int largerst(int first , int second, int third){

        int max = first;
        if(second>max)
        {
            max = second;
           
        }
         if(third>max)
        {
             max = third;
             

        }
        return max;


    }

    static int lowest(int first, int second, int third)
    {
        int low = first;
        if(second<low)
        {
          low = second;
        }
         if(third<low)
        {
            low = third;
        }
        return low;
    }
}
