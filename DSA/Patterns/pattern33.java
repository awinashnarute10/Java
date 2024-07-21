package DSA.Patterns;

public class pattern33 {

    public static void main(String[] args) {
        int n = 5;
        int x = 0;
        char c = 'a';
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                c++;
                if (x == 0) {
                    c -= (char) (32);
                    x = 1;
                } else {
                    c += (char) (32);
                    x = 0;
                }
            }
            System.out.println();

        }

    }

}
