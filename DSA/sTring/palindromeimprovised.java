package DSA.sTring;

public class palindromeimprovised {

    public static void main(String[] args) {
        String a = "Malayalam";
        System.out.println(palindrome(a));
    }

    public static boolean palindrome(String a)
    {
        a = a.toLowerCase();
        int s= 0, e = a.length()-1;  // two pointer approach
         while (e>s) {
            if(a.charAt(s)==a.charAt(e))
            {
                s++;
                e--;
            }
             
            else return false;
         }
         return true;
    }
    
}
