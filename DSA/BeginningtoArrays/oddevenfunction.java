package DSA.BeginningtoArrays;
import java.util.Scanner;

public class oddevenfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddeven(n);
        sc.close();
        
    }
    static void oddeven(int n)
    {
        if(n==1)
        {
            System.out.println("odd");
        }

        if(n%2==0)
        {
            System.out.println("even");
        }
         else{
            System.out.println("Odd");
         }
    }
}
