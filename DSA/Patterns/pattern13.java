package DSA.Patterns;

public class pattern13 {

    public static void main(String[] args) {
        
        int n =5;

        for (int i = 0; i < n; i++) {
          int space = n-i;

          for (int j = 0; j < space; j++) {
            System.out.print(" ");
          }
            for (int j = 0; j <=2*i; j++) {
                if (j==0||i==n-1||j==2*i) {
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
