package DSA.BeginningtoArrays;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
//        boolean b =true;
        a = a.toLowerCase();
//        for(int i = 0;i<=a.length()/2; i++)
//        {
//         if(a.charAt(i)!=a.charAt(a.length()-1-i))
//         {
//                b = false;
//                break;
//         }
//        }
//       if(b)
//       {
//         System.out.println("Palindrome");
//       }
    
//       else
//   {
//     System.out.println("Not palindrome");
//   }
// OR
          
      String rev = "";

      for(int i =a.length()-1;i>=0;i-- )
      {
        rev = rev+a.charAt(i);
      }
       if(a.equals(rev))
       {
        System.out.println("Palindrome");
       }
else{
    System.out.println("Not a palindrome");
    sc.close();
}

    }
    
}
