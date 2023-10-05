package DSA;

import java.util.Scanner;

public class vowelornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character:- ");
        char v = sc.next().charAt(0);
        v = Character.toLowerCase(v);

        if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
        {
            System.out.println("Vowel");

        }
        else{
            System.out.println("Consonant");
        }
        
        sc.close();



    }
    
}
