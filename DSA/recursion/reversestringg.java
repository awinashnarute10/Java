package DSA.recursion;

import java.util.Arrays;

public class reversestringg {

    public static void main(String[] args) {
        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int st = 0;
        int e = s.length - 1;

        System.out.println(Arrays.toString(reverse(s, st, e)));

    }

    public static char[] reverse(char[] s, int st, int e) {
        if (st == s.length || st == e || st > e) {
            return s;
        }

        char c = s[st];
        s[st] = s[e];
        s[e] = c;

        return reverse(s, st + 1, e - 1);
    }
}
