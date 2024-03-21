package DSA.BeginningtoArrays;

import java.util.Scanner;

public class alphabetcasecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);
        sc.close();
        if(c>='a' && c<='z')
        {
           System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Uppercase");
        }
    }
    
}
