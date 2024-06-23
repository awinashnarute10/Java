package DSA.sTring;

public class halvealike {

    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
    
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int f = 0;
        
        for(int i =0,  j = (s.length()/2); i<s.length()/2&&j<s.length(); i++, j++)// i counts the first half and j the second half
        {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') f++;
                if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u') f--;
        }
        if(f==0) return true;
        return false;
    }
}
