package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CountItems {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add( Arrays.asList("phone","blue","pixel"));
        items.add( Arrays.asList("computer","silver","phone"));
        items.add( Arrays.asList("phone","gold","iphone"));
    
        int flag=0,match=0;
        String ruleKey = "type";
        String ruleValue = "phone";
        // if(ruleKey=="color")
        // {
        //     flag=1;
        // }
        // else if(ruleKey=="name")
        // {
        //     flag=2;
        // }
        // for(int i = 0; i<items.size(); i++)
        // {
        //     for(int j = flag; j<=flag; j++)
        //     {
        //           if(ruleValue==items.get(i).get(j))
        //           {
        //             System.out.println(items.get(i).get(j));
        //               match++;
        //           }
        //     }
        // }
        

        // System.out.println(match);
// leetcode solution


        int count = 0;

        for (List<String> item : items) {
            if ((ruleKey.equals("type") && ruleValue.equals(item.get(0))) ||
                (ruleKey.equals("color") && ruleValue.equals(item.get(1))) ||
                (ruleKey.equals("name") && ruleValue.equals(item.get(2)))) {
                count++;
            }
        }

       System.out.println(count);
    }





    }
    

