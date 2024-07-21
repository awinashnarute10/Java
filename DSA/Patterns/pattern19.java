package DSA.Patterns;

public class pattern19 {

    public static void main(String[] args) {
        
        int n =5;
         
        for (int i = 0; i < 2*n-1; i++) {

       int c = i>n-1?2*n-i-1:i+1;

       for (int j = 0; j < c; j++) {

        System.out.print("*");
        
       }

       int space = i>n-1?2*(i-(n-1)):2*(n-1)-2*i;

       for (int j = 0; j < space; j++) {

        System.out.print(" ");
        
       }

       for (int j = 0; j < c; j++) {

        System.out.print("*");
        
       }
       System.out.println();
            
        }
    }
    
}
