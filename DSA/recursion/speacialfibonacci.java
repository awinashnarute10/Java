package DSA.recursion;

public class speacialfibonacci {

    public static void main(String[] args) {
        int a = 86;
    int b = 77;
       int n = 2;
       System.out.println(speacialfibo(n, a, b));
}
    
    static int speacialfibo(int n, int a, int b){
        // if(n==1)
        // {
        //     return b;
        // }
        // if(n==0)
        // {
        //     return a;
        // }
        // else{
        //     return speacialfibo(n-1, a, b)^speacialfibo(n-2, a, b);
        // }

        if(n%3==0)
        {
            return a;

        }
        if(n%3==1)
        {
            return b;
        }
        else{
            return a^b;
        }
    }
}