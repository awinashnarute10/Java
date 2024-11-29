package DSA.recursion;

public class reducetozeero {

    public static void main(String[] args) {
        int n = 14;
        
        System.out.println(steps(n));

    }

    public static int steps(int n){
        if(n==0)
        {
            return 0;
        }
        if(n%2==0)
        {
            return 1+steps(n/2);
        }
        return 1+steps(n-1);
    }
    
}
