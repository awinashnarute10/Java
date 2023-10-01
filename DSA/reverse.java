package DSA;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // sc.close();

        // String a = String.valueOf(x);
        // String b = "";
        // int n = a.length()-1;
        // for(int i =n; i>=0; i--)
        // {
        //    b = b+a.charAt(i);
        // }
        // int rev = Integer.parseInt(b);
        // System.out.println(rev);
        // OR
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
         int n = String.valueOf(x).length();
         int rev=0;


         for(int i = 1; i<=n;i++)
         {
             int b = x%10;
             x=x/10;
             rev = (rev*10)+b;
         }

           System.out.println(rev);

        
    }
    
}
