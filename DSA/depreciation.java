package DSA;

import java.util.Scanner;

public class depreciation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original price:- ");
        float val = sc.nextInt();
        System.out.println("Enter depreciation rate:- ");
        float per = sc.nextInt();

        float dep = (per/100)*val;
        System.out.println(dep);
        float finals = val-dep;
        
        System.out.println("Value after depreciation:- "+finals);
        sc.close();

        
    }
    
}
