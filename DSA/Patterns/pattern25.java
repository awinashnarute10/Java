package DSA.Patterns;

public class pattern25 {
    public static void main(String[] args) {
        int n =5;

        for (int i = 0; i < n; i++) {

            for (int j = n-2-i; j >=0 ; j--) {
                System.out.print(" ");
                
            }

            for (int j = 0; j < n; j++) {

                if (j==0||j==n-1||i==0||i==n-1) {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
    
}
