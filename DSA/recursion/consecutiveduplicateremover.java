package DSA.recursion;

public class consecutiveduplicateremover {

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String stack = "";
        int i = 0;
        System.out.println(remover(s, stack, i));
    }

    public static String remover(String s, String stack, int i)
    {
        if(i>=s.length())
        {
            return stack;
        }
       int j = i+1;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j))
            {
                j++;
            }
            else{stack+=s.charAt(i);
            return remover(s, stack, j);
            }
        }
        return stack;
    }
    
}
