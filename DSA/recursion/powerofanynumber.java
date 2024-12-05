package DSA.recursion;

import java.util.Scanner;

public class powerofanynumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number after power");
        int n = sc.nextInt();
        System.out.println("Provide number");
        int a = sc.nextInt();
        sc.close();
        System.out.println(isPower(n, a));

    }

    public static boolean isPower(int n, int a){
           if(n==1)
           {
            return true;
           }
           if(n%a!=0)
           {
            return false;
           }
           return isPower(n/a, a);
    }
    
}
