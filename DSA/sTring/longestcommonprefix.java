package DSA.sTring;

import java.util.Arrays;

public class longestcommonprefix {
    
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // sorted so that the first and last string can be comapred so that min prefix can be determined
        int i = 0;
        while(i<strs[0].length()) 
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)) // comparing char by char
            {
                i++;
            }
            else{break;}
        }
        return strs[0].substring(0,i);
    }
}
