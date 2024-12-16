package DSA.Math;

public class factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialfinder(n));
    }

    static  int factorialfinder(int n) {
        if(n<=1){
            return n;
        }
        
        return n*(factorialfinder(n-1));
}
    
}
