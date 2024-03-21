package DSA.BeginningtoArrays;
import java.util.Scanner;

public class primebetn2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();

        prime(n, n1);
        sc.close();
        
    }
    static void prime(int n, int n1)
    {
        for(int i = n+1; i<n1; i++)
        {
            int a = 0;
               int b = (int)(Math.sqrt(i));
               for(int j=2;j<=b; j++)
               {
                if(i%j==0)
                {
                    a=1;
                    break;
                    
                }
               }
               if(a==0)
               {
                System.out.println(i);
               }
        }

    









        
    }
    
}
