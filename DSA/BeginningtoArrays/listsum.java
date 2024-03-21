package DSA.BeginningtoArrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class listsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum1 = 0, sum = 0, sum2 = 0;
        while(true)
        {
              
            try {
                n = sc.nextInt();
                 if(n<0)
                  {
                      sum1 = sum1+n;
                  }
                  if(n>=0)
                  {
                    if(n%2==0)
                    {
                        sum = sum+n;
                    }
                    else{
                        sum2 = sum2 +n;
                    }
                  }
                
            } catch (InputMismatchException e) {
                
                break;
            }
                 
        sc.close();
          
           
        }
        
        System.out.println("Sum of negative no = "+sum1);
        System.out.println("Sum of positive even no= "+sum);
        System.out.println("Sum of positive odd no = "+sum2);

        
        
    }
    
}
