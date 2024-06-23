package DSA.sTring;

public class sortingsequence {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }
    
    public static String sortSentence(String s) {
        
        String delimitter = " ";// tells the .split function where to split  
        String[] ss = s.split(delimitter);
       
        int[] pos = new int[ss.length];

        for(int i =0; i<pos.length; i++)
        {
              pos[i]= ss[i].charAt(ss[i].length()-1)-'0'; // saves the int from last char of each string 
              ss[i] = ss[i].substring(0, ss[i].length() - 1); // removes the last char of each string i.e the numbers
              
        }
        String[] sss = new String[ss.length];
        for (int i = 0; i < ss.length; i++) {
            sss[pos[i]-1] = ss[i];// saves the string in appropriate positions 
        }
        String str = String.join(" ", sss); // joins the string back together
        return str;

    }
}
