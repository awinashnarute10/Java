package DSA.BeginningtoArrays;
import java.util.Scanner;

public class hcfandlcm {
    public static void main(String[] args) {
        int a, b, hcf=0;;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Two Numbers: ");
      a = s.nextInt();
      b = s.nextInt();
      s.close();
      for(hcf=(a>b)?b:a; true; hcf--)                // number starting from the smaller no of the given two number should divide both number perfectly till it reaches 1 
      {
          if(a%hcf==0 && b%hcf==0)
          {
            break;
          }



      }
      

      //int lcm = (a*b)/hcf;
     int lcm;                                   // lcm should start from bigger no and go on till both numbers can divide it perfectly
      for(lcm = (a>b)?a:b; true;lcm++)
      {
        if(lcm%a==0 && lcm%b==0)
        {
            break;
        }
      }


      System.out.println("lcm of given numbers = "+lcm);
    
      
      System.out.println("\nHCF of Given Two Number = " +hcf);
    
    }
    
}
