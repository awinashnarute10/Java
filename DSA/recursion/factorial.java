package DSA.recursion;

public class factorial {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fact(n));
    }

    public static int fact(int n)
    {
          if(n<=1)
          {
            return 1;
          }
          return n*fact(n-1);
    }
    
}
