package DSA.recursion;

public class geekonaaci {
    public static void main(String[] args) {
        int a = 1, b = 3, c=2;
        int n = 6;

        System.out.println(ans(n, a, b, c));
    }

    public static int ans(int n, int a, int b, int c){
        if(n==1)
        {
            return a;
        }
        if(n==2){
            return b;
        }
        if(n==3){
            return c;
        }
        else{
            return ans(n-1, a, b, c) + ans(n-2, a, b, c)+ ans(n-3, a, b, c);
        }

    }

}
