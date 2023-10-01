package DSA;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int x,i=0;
        int b=0;
        Scanner sc = new Scanner(System.in);
        while( i<9)
        {
             System.out.println("Enter a numeber= ");
             x = sc.nextInt();
             double c = Math.sqrt(x);//we have to check only till square root of that no
             for(int j=2;j<=c;j++)
             {
                 int a = x%j;
                 
                 if(a==0)
                 {
                    System.out.println("Not a prime number");
                    b=1;
                    break;
                 }


             }
             
             if(b!=1){
                System.out.println("Prime number");
                b=0;
             }
             System.out.println("if you want to continue press single digit number or else press any double digit number");
             i = sc.nextInt();
        }
        System.out.println("you chose to exit thank you for using program");
        sc.close();
        
    }

}
