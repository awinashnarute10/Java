package DSA.Bitwise;

public class consistentString {

    public static void main(String[] args) {
        String allowed = "cad"; 
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};

        System.out.println(countConsistentStrings(allowed, words));
    }

    // public static int countConsistentStrings(String allowed, String[] words) {
    //     boolean[] consistent = new boolean[123];

    //     for(int i = 0; i<allowed.length(); i++)
    //     {
    //         consistent[allowed.charAt(i)]= true;
    //     }
    //     int count = 0;

    //     for(int i = 0; i<words.length; i++)
    //     {
    //         if(isConsistent(words[i],consistent))
    //         {
    //           count++;
    //         }
    //     }

    //     return count;
        
    // }

    // public static boolean isConsistent(String s, boolean[] consistent)
    // {
    //        for(int i = 0; i<s.length(); i++)
    //        {
    //         if(!consistent[s.charAt(i)]){
    //             return false;
    //         }
    //        }
    //        return true;
    // }

    public static int countConsistentStrings(String allowed, String[] words) {
        int allowmask = 0;
        int wordmask = 0;
        int count = 0;

        for(char c: allowed.toCharArray()){
            allowmask|=(1<<(c-'a'));
        }

        for(String s: words){
            for(char c: s.toCharArray())
            {
                wordmask|=(1<<(c-'a'));
            }
            if((wordmask&~allowmask)==0)
            {
                count++;
            }
        }
        return count;
    }
}
    

