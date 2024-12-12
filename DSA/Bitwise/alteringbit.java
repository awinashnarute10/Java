package DSA.Bitwise;

public class alteringbit {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(hasAlternatingBits(n));
    }

    public static boolean hasAlternatingBits(int n) {
    
        while(n>0)
        {
            int lastbit = n&1;
            int secondlastbit = (n>>1)&1;
            if(lastbit==secondlastbit)
            {
                return false;
            }
            n>>=1;
        }
        return true;
    }
    
}
