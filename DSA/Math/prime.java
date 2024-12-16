package DSA.Math;

public class prime {

    public static void main(String[] args) {
        int n = 97;
        int count = 0;

        for (int i = 2; i*i<=n; i++) {

            if(i%n==0)
            {
                System.out.println("Not a Prime");
                count++;
                break;
            }
            
        }
        if (count!=1) {
            System.out.println("Prime");
            
        }

    }
    
}
