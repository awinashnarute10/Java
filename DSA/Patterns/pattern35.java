package DSA.Patterns;

public class pattern35 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }

            int space = ((n - 1) * 2 - (i - 1) * 2);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }

            System.out.println();

        }
    }

}
