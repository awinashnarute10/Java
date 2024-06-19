package DSA.sTring;

public class goalparser {
    public static void main(String[] args) {
        String command ="(al)G(al)()()G";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder s = new StringBuilder();
 
        for(int i = 0; i<command.length(); i++)
        {
         if(command.charAt(i)=='G') s.append('G');
         else if(command.charAt(i)=='(')
         {
             if(command.charAt(i+1)==')') s.append('o');
             else s.append("al");
         }
        }
        return s.toString();
     }
    
}
