package DSA.Math;

public class stairsways {

    public static void main(String[] args) {
        int n = 5; // 8 ,ways to reach step 4 + ways to reach step 3

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int[] ways = new int[n+1];
          ways[2]=2;
          ways[3] =3;

          for(int i = 4; i<=n; i++)
          {
            ways[i] = ways[i-1]+ways[i-2];
          }

          return ways[n];
    }

    
}
