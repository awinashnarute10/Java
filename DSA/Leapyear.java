package DSA;
import java.util.Scanner;      
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double y=1000;

         
        while(y>999)
        {
             y = sc.nextInt();
                if(y%4==0)
                {
                    System.out.println("Leap year!!");
                }
             else
             {
                System.out.println("Not a leap year");
             }




         }
         sc.close();
    System.out.println("You chose to exit program");
    }
    
}
