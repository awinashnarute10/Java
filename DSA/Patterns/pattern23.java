package DSA.Patterns;

public class pattern23 {

    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" ");
                
            }
            
            for (int j = 0; j <=((n-1)*2)+(i*2); j++) {
                if(j==0||j==i*2||j==(n-1)*2||j==((n-1)*2)+(i*2))
                {
                    
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
            
        }
    }
    
}
