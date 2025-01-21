package DSA.recursion;

public class reversenumber {

    public static void main(String[] args) {
        int n = 1824;
        int ans = 0;

        rev1(n);
        System.out.println(sum);

        System.out.println(rev2(n));
    }


          static int sum = 0;
    public static void rev1(int n)
    {
       if(n==0)
       {
        return;
       }
       int rem = n%10;
    sum=sum*10+rem;
    rev1(n/10);
        
    }


    public static int rev2(int n)
    {
        int digits = (int)(Math.log10(n)+1);
        return helperforrev2(digits, n);


    }

    private static int helperforrev2(int digits, int n){
        if(n%10==n)
        {
            return n;
        }

        int rem = n%10;

        return rem*(int)Math.pow(10, digits-1)+helperforrev2(digits-1, n/10);
    }

    
}
