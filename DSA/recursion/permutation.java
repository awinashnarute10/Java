package DSA.recursion;

import java.util.ArrayList;

public class permutation {

    public static void main(String[] args) {
        String up = "abc";
        String p = "";

        System.out.println(permutationList(p, up));

        System.out.println(CountPermutations(p, up));

    }

    public static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
              char c = up.charAt(0);
              ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <=p.length(); i++) {
              String f = p.substring(0,i);
              String s = p.substring(i);
              ans.addAll(permutationList(f+c+s, up.substring(1)));
            
        }

        return ans;
    }

    public static int CountPermutations(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
            int count  = 0;
        char c = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
           count+=CountPermutations(f+c+s, up.substring(1));
    
            
        }
        return count;
    }
}