package DSA.recursion;

import java.util.ArrayList;

public class dicerollsum {

    public static void main(String[] args) {
        int target = 6;
        String p = "";
 
        System.out.println(sum(p, target));

    }

    public static ArrayList<String> sum(String p, int target){
           if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
           }
          
           ArrayList<String> ans = new ArrayList<>();
           for (int i = 1; i <=target&&i<=6; i++) {
              
            ans.addAll(sum(p+i, target-i));
            
            
           }

           return ans;
           

    }
    
}
