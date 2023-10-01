package DSA;
import java.lang.Math;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        sc.close();
        int r = String.valueOf(no).length();
        
        int temp = no;
        double sum=0;


        while(temp>0)
        {
           int x = temp%10;
           temp = temp/10;
           sum = sum+Math.pow(x,r);
        }
        
        if(sum==no)
        {
            System.out.println("armstrong no");
        }
        else
        {
            System.out.println("popat");
        }
    }
    
}
