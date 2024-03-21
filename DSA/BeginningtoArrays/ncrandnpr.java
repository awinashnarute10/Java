package DSA.BeginningtoArrays;
import java.util.Scanner;

public class ncrandnpr {
    int fact(int n)
    {
        
        int i =n, fact=1;
        while(i>=1)
        {
            fact = fact*i;
            i--;
        }
        return fact;
    }

    int permutation(int n, int r)
    {
        int per = fact(n)/fact(n-r);
        return per;
    }
    int combination(int n, int r)
    {
        int comb = fact(n)/(r*fact(n-r));
        return comb;
    }
 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        ncrandnpr obj = new ncrandnpr();
        System.out.println("Permutation = "+obj.permutation(n,r));
        System.out.println("combination = "+obj.combination(n, r));

        sc.close();
    
     }
   

}
