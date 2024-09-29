package DSA.BeginningtoArrays;

import java.util.Scanner;

public class allfactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            if(n==0)
            {
                break;
            }
            else{
                System.out.println("factors are :- ");
            for(int i =1; i<=n; i++)
            {
                
                if(n%i==0)
                {
                    System.out.println(i);
                }
            }
        }
        }
        sc.close();
        // just testing 
    }
    
}
