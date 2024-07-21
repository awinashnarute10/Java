package DSA.Patterns;

public class pattern32 {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (char c = (char) ('A' + n - i - 1); c <= 'E'; c++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

}
