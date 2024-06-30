package DSA.sTring;

public class validpalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
         System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
    //    s =  s.replaceAll("[^a-z0-9]", "");   // replace all that is not a-z and 0-9 with "" therefore also removing spaces 
    //  int f= 0, e = s.length()-1;  // two pointer approach
    //      while (e>f) {
    //         if(s.charAt(f)==s.charAt(e))
    //         {
    //             f++;
    //             e--;
    //         }
             
    //         else return false;
    //      }
    //      return true;

    // two pointer approach
    int p1 = 0 , p2 = s.length()-1;
    char c1 = s.charAt(p1); // char at 0th pos
    char c2 = s.charAt(p2); // char at last pos

    while(p1<=p2)
    {
        if(!(c1>='a'&&c1<='z' || c1>=0&&c1<=9)) // if c1 is not digit or char than move ahead by 1 
        {
            p1++;
        }
        if(!(c2>='a'&&c2<='z' || c2>=0&&c2<=9))// if c2 is not dig or char than move back by 1 
        {
            p2--;
        }
        else   // if both are dig or char 
        {
            if(c1!=c2) return false;     // if both are not equal than return false
            p1++;   // else move 1 back and 1 ahead of p2 and p1 respectivley
            p2++;
        }
    }
    return true;
    }
    
}