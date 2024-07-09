package DSA.Patterns;

public class pattern10 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
              
            int space = n-i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
                
            }

            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    
}
