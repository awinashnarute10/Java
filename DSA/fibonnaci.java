package DSA;

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int a = 0;
        int b = 1;
        int sum;
            System.out.println("enter n value");
        int n = sc.nextInt();
       if(n==0)
       {
        break;
       }
        if(n==1)
        {
            System.out.println("0");
            continue;
        }
        if(n==2)
        {
            System.out.println("0,1");
            continue;
        }
         else{
            System.out.print("0,1");
            for(int i = 3; i<=n; i++)
            {
                sum = a+b;
                a=b;
                b = sum;
                System.out.print(","+sum);
            }
            System.out.println("");
           
         }
 
        }
         sc.close();
    }
        
    }
    

