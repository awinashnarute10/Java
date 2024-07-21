package DSA.Patterns;

public class pattern26 {
    
    public static void main(String[] args) {
        
        int n = 6;

        for (int i = 1; i <=n; i++) {

            for (int j = n+1-i; j>=1; j--) {
                System.out.print(i);
                
            }
            System.out.println();
            
        }

    }
}
