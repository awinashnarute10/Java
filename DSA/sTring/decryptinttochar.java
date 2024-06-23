package DSA.sTring;

public class decryptinttochar {

    public static void main(String[] args) {
         String s = "1326#";
         System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)// starting from last so that we can detect two digit by detecting # first
        {
            if (s.charAt(i) == '#')// if # is detected then
            {
                builder.append((char) (96 + (s.charAt(i - 1) - '0') + 10 * (s.charAt(i - 2) - '0')));// we will add those two digits   an then convert  them to char and  append in builder
                i -= 2;// skipping those two numbers
            } else {
                builder.append((char) (96 + (s.charAt(i) - '0')));// if # not detected then normally create char from  number and append
            }
        }
        builder = builder.reverse();// the char are stored in reverse order as we started from right side therefore reversing the builder
        return builder.toString();// converting builder to string and returning

    }
    
}
