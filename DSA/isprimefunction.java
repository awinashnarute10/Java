package DSA;

import java.util.Scanner;

public class isprimefunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is prime:- "+isPrime(n));
        sc.close();
    }
    static boolean isPrime(int n)
    {
        if(n==1||n==0)
        {
            return false;
        }
       else
       {
        int c = (int)(Math.sqrt(n));
        int i =2;
        
        while(i<=c)
        {
            if(c%i==0)
            {
                return false;
                
            }
            i++;
        }
        return true;
        
       }
    }
}
