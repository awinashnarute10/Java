package DSA.Bitwise;

public class complement {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findComplement(n));
    }

    public static int findComplement(int num) {
        int mask = 0;
        int temp = num;
        while (temp > 0) {

            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        return num ^ mask;

    }
    
}
