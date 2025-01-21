package DSA.recursion;

public class countzeroes {

    public static void main(String[] args) {
        int n = 50005; // 2
        int ans = 0;
        System.out.println(zeroes(n, ans));
    }

    public static int zeroes(int n, int ans){
          if(n==0)
          {
            return ans;
          }

          if(n%10==0){
            return zeroes(n/10, ++ans);
          }
          else{
            return zeroes(n/10, ans);
          }

    }
    
}
