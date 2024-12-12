package DSA.Bitwise;

public class primesetbits {

    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        System.out.println(countPrimeSetBits(left, right));
    }

    public static int countPrimeSetBits(int left, int right) {
        int countPrime = 0;

        for (int i = left; i <= right; i++) {
            
            int setBits = countSetBits(i);

           
            if (isPrime(setBits)) {
                countPrime++;
            }
        }
        return countPrime;
    }

   
    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n-(n&(-n));
                count++;
            
            
        }
        return count;
    }

   
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true; 
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; 
        }
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
}
