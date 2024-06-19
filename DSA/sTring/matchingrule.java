package DSA.sTring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class matchingrule {

    public static void main(String[] args) {
        // String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}}; 
        List<List<String>> items = new ArrayList<List<String>>();
items.add(Arrays.asList("phone","blue","pixel"));
items.add(Arrays.asList("computer","silver","lenovo"));
items.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey = "color"; 
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    
     public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
int count = 0;
        switch(ruleKey){
            case "type":
            for(List<String> item:items)
            {
                if(ruleValue.equals(item.get(0))) count++;
            }
            break;

             case "color":
            for(List<String> item:items)
            {
                if(ruleValue.equals(item.get(1))) count++;
            }
            break;

             case "name":
            for(List<String> item:items)
            {
                if(ruleValue.equals(item.get(2))) count++;
            }
            break;
        }
        return count;
    }
}
