package DSA.Patterns;

public class pattern34 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {

            for (char j = (char) ('A' + (n - i - 1)); j >= 'A'; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
