package DSA.Searching;

public class arrangingcoins {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(coinsarrange(num));
    }
    static int coinsarrange(int n)
    {
        int i = 0;
   while(i<n)
   {
    i++;
    n=n-i;
    
   }
   return i;
    }
}
