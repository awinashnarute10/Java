package DSA.Patterns;

public class pattern5 {

    public static void main(String[] args) {
        int n = 4;

    for(int i = 0; i<2*n-1; i++)
    {
          int c = i>n-1 ? 2*n-i-2:i;

          for (int j = 0; j <= c; j++) {
            System.out.print("*");
            
          }
          System.out.println();
    }
    }
    
}
