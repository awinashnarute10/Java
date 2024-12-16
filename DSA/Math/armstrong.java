package DSA.Math;

public class armstrong {

    public static void main(String[] args) {
        int n = 371;
        System.out.println(isArmstrong(n));

    }

    public static boolean isArmstrong(int n)
    {
          int sum = 0;
          int temp = n;
          int count = countDigits(n);
          while(n!=0)
          {
            sum+=Math.pow(n%10, count);
            n/=10;
          }
          return sum==temp;
    }

    public static int countDigits(int n){
        int count = 0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        return count;
    }
    
}
