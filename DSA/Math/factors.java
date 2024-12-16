package DSA.Math;

public class factors {

    public static void main(String[] args) {
        int n = 20; // after sqrt of n the factors repeat so we will return i and n/i such that n%i==0;
        factor(n);
    }
    
    public static void factor(int n)
    {
         for (int i = 1; i*i<=n; i++) {

            if(n%i==0)
            {
                if(n/i==i)
                {
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
            
         }
    }
}
