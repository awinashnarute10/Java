package DSA.sTring;

public class indexoffirstoccurence {

    public static void main(String[] args) {
        String haystack = "sadbutsad"; 
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
    
    public static int strStr(String haystack, String needle) {
        
        // return haystack.indexOf(needle);

        // more logical one 0ms:- 
        int h = haystack.length();
        int n = needle.length();

        for(int  i = 0 ; i<h-n; i++)
        {
            if(haystack.subSequence(i, i+n).equals(needle)) return i;
        }
        return -1;
    }
}
