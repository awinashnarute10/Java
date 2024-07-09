package DSA.sTring;

public class maximumrepeatingsubstring {
    
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence, word));

    }

    public static int maxRepeating(String sequence, String word) {

        String wordtofind   = word;
        int k = 0;

        while(sequence.contains(wordtofind))// if word is ab then next word will be abab so itwill find max repeating sustring
        {
            k++;
            wordtofind+=word;
        }
        return k;

        // this is acceptable for except one testcase that is being used now 
//         int k = 0;
//        int i = 0;
//        int j = word.length();
//    int x = 0;
//        while (j <= sequence.length()) {
//            if (sequence.substring(i, j).equals(word)) {
//                if(x==1)
//                {
//                    k=0;
//                    x=0;
//                }
//                k++;
//                i = j;
//                j = i + word.length();
              
               
//            } else {
//                i++;
//                j++;
//                x=1;
                  
               
//            }
//        }
//        return k;
       }
}
