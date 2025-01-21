package DSA.recursion;

import java.util.ArrayList;

public class phonepad {

    public static void main(String[] args) {
        String up = "12";
        String p = "";
 System.out.println(decoding(p, up));

    }

    public static ArrayList<String> decoding(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        int digit = up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3; i++) {
             char c = (char)('a'+i);
             ans.addAll(decoding(p+c, up.substring(1)));
            
        }

        return ans;
         

        
    }
    
}
