package DSA.recursion;

public class palindrome {
    public static void main(String[] args) {
        String s = "";
        char[] str = s.toCharArray();
        int st = 0;
        int e = str.length - 1;
        System.out.println(ispalindrome(str, st, e));
    }

    static boolean ispalindrome(char[] str, int st, int e) {
        if (st > e) {
            return true;
        }
        if (str[st] == str[e]) {
            return ispalindrome(str, st + 1, e - 1);
        } else {
            return false;
        }
    }

}
