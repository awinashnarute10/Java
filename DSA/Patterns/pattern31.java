package DSA.Patterns;

public class pattern31 {

    public static void main(String[] args) {
        
        int n = 4; 
      
        for (int i = 1; i < 2*n; i++) {
            
         for (int j = 1; j < 2*n; j++) {
          int up = i; 
          int  down = 2*n-i;
          int left = j; 
          int  right = 2*n-j;
          int x1 = Math.min(Math.min(left, right),Math.min(up,down));
          int x = (n+1)-x1;

          System.out.print(x+" ");
            
         }
         System.out.println();
        }
    }
    
}
