package DSA.recursion;

public class onetoN {
    public static void main(String[] args) {
        int N = 10;
        printNos(N);
    }

    public static void printNos(int N) {
        int i = 1;
        print(N, i);
    }

    public static void print(int N, int i) {
        System.out.println(i + " ");

        if (i == N) {
            return;
        }
        print(N, i + 1);
    }
}