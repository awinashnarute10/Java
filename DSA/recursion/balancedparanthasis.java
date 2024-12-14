package DSA.recursion;

public class balancedparanthasis {

    public static void main(String[] args) {
        String s  = "[{}]";
        
        @SuppressWarnings("unused")
        String stack = "";
       System.out.println(isBalanced(s.toCharArray(), 0, ""));
          
    }

   public static boolean isBalanced(char[] c, int index, String stack){
    if(index==c.length){
        return stack=="";
    }
    

    if(c[index]=='{'||c[index]=='('||c[index]=='[')
    {
        return isBalanced(c, index+1, stack+c[index]);
    }
    if(c[index]=='}'||c[index]==')'||c[index]==']'){
        if(index==0||!matches(stack.charAt(stack.length()-1),c[index]))
        {
            return false;
        }
        return isBalanced(c, index+1, stack.substring(0, stack.length()-1));
    }
    return false;


   }

   public static boolean matches(char open, char close)
   {
    return (open=='{'&&close=='}')||(open=='('&&close==')')||(open=='['&&close==']');
   }
    
}
