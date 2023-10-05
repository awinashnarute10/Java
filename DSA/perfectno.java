package DSA;

import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no ");
        int n = sc.nextInt();
        System.out.println(n);
      
        int sum = 0, i = 1;
        while(i<=n-1)
        {
           
            if(n%i==0)
            {
                sum = sum+i;
                
            }
            i++;
            
        }
        
     if(sum==n)
     {
        System.out.println("Perfect no");
     }
     else{
        System.out.println("Not a perfect no");
     }
sc.close();
    }
    
}
