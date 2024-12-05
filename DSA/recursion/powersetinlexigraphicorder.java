package DSA.recursion;

import java.util.Arrays;

public class powersetinlexigraphicorder {

    public static void main(String[] args) {
        String s  = "cab";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String curr = "";
        operation(new String(arr), curr, 0, arr.length);
        
       
        
    }

    public static void operation(String s, String curr, int i, int n){
         if(i==n){
            if(!curr.equals("")){
            System.out.println(curr);
            }
            return;
         }
         

            operation(s, curr+s.charAt(i), i+1, n);

            operation(s, curr, i+1, n);
            
         }

    }
    

