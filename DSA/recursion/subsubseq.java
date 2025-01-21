package DSA.recursion;

import java.util.ArrayList;

public class subsubseq {

    public static void main(String[] args) {
        
        String up = "abc";
        String p = "";
        
        System.out.println(set(p, up));

    }

    static ArrayList<String> set(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!p.isEmpty()){
            list.add(p);
            }
            return list;

        }

        char ch = up.charAt(0);
        ArrayList<String> left = set(p+ch, up.substring(1));
        ArrayList<String> right = set(p, up.substring(1));

        left.addAll(right);
        return left;
        
    }
    
}
