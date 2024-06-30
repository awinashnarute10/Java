package DSA.sTring;

public class reversewordsinstringIII {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        
         String[] words = s.split(" ");// storing each word of string

        // for(int j =0; j<words.length; j++)
        // {
        //     char[] arr = words[j].toCharArray();// storing each char of each word 
        //     char temp;
        //     for(int i = 0; i<arr.length/2; i++)
        //     {
        //         temp = arr[i];                     // reversing the words char 
        //         arr[i] = arr[arr.length-1-i];
        //         arr[arr.length-1-i] = temp;
        //     }
        //     words[j] = String.valueOf(arr);        // reversed char array back to word
        // }

        // s = String.join(" ", words);       // words back to string 
        // return s;

        //low ms solution:- 
StringBuilder str = new StringBuilder();
for(String word : words)
{
    StringBuilder rev = new StringBuilder(word).reverse();
    str.append(rev).append(" ");
}
return str.toString().trim();


    }
    
}
