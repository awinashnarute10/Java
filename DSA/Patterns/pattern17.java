package DSA.Patterns;

public class pattern17 {

    public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i < 2*n; i++) {

            int s = Math.abs(n-i);
            for (int j = 0; j <=s ; j++) {
                System.out.print(" ");
            }
             
            int c = i>n? 2*n-i:i;

            for (int j = c; j >=1; j--) {
                System.out.print(j);
                
            }

            for (int j = 2; j <= c; j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
    
}
