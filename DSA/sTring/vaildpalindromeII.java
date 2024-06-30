package DSA.sTring;

public class vaildpalindromeII {

    public static void main(String[] args) {
       String s = "atbbga";
       System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int p1 = 0, p2 = s.length()-1;
        

        while(p1<=p2)
        {
            char c1 = s.charAt(p1);
        char c2 = s.charAt(p2);
           if(c1!=c2)
           {
              return (isvalidPalindrome(s,p1+1,p2)||isvalidPalindrome(s,p1,p2-1));
           }
           p1++;
           p2--;
        }
        return true;
    }

    public static boolean isvalidPalindrome(String s, int i, int  j)
    {
           
        

        while(i<=j)
        {
            char c1 = s.charAt(i);
        char c2 = s.charAt(j);
           if(c1!=c2)
           {
              return false;
           }
           i++;
           j--;
        }
        return true;
    }
    
}
