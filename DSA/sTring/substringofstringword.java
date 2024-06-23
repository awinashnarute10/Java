package DSA.sTring;

public class substringofstringword {
    public static void main(String[] args) {
       String[] patterns = {"a","abc","bc","d"};
       String word = "abc";

       System.out.println(numOfStrings(patterns, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String pattern:patterns)
        {
            // int fi = word.indexOf(pattern);
            // if(fi!=-1) count++;
            if(word.contains(pattern)) count++;
        }
        return count;
    }
    
}
