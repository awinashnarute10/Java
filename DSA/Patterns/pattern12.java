package DSA.Patterns;

public class pattern12 {

    public static void main(String[] args) {
         
        int n = 5;

        for (int i = 0; i < 2*n-1; i++) {

            int space = i>n-1?2*n-i-2:i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            
            for (int j = i>n-1?i-n+2:n-i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
            
                
            }
        }


    }
    

