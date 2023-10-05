package DSA;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            int fac = 1;

            for(int i =n; i>=2; i--)
            {
                fac = fac*i;
            }
            System.out.println("factorial = "+fac);
            sc.close();
        }
    }
    
}
