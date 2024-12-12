package DSA.Bitwise;

public class Hammingdistance {

    public static void main(String[] args) {
       int x = 1;  //0001
       int y = 4;  //0100  therfore output should be 2

       // now the logic is we xor both number so that result is wherever the numbers/setbits are different it will be shown in xored number
       // here xored number will be 0101 so now we have to just calculate number of set bits and if 1 was at same position then it will be xored to 0 therefore wont be counted
       System.out.println(hammingDistance(x, y));


    }

    public static int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;

        while (n > 0) {
            n = n - (n & (-n));
            count++;
        }
        return count;
    }
    
}
