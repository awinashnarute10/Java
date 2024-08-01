package DSA.recursion;

public class firstuppercase {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int i = 0;

        System.out.println(uppercase(str, i));
    }

    static char uppercase(String str, int i) {
        if (i == str.length()) {
            return '0';
        }
        if (Character.isUpperCase(str.charAt(i))) {

            return str.charAt(i);
        } else {
            return uppercase(str, i + 1);
        }
    }

}
