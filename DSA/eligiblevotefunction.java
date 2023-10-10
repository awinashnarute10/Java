package DSA;

import java.util.Scanner;

public class eligiblevotefunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("eligible for voting? :-"+ isEligible(n));
        sc.close();
    }
    static boolean isEligible(int n)
    {
        return n>18;
    }
    
}
