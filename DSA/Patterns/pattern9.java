package DSA.Patterns;

public class pattern9 {

    public static void main(String[] args) {
        
       int n = 5;

       for (int i = 0; i < n; i++) {

        int space = i;
         for (int j = 0; j < space; j++) {

            System.out.print(" ");
            
         }

         for (int j = 0; j <2*(n-i-1)+1; j++) {
            System.out.print("*");
            
         }
         System.out.println();
        
       }
    }
    
}
