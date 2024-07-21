package DSA.Patterns;

public class pattern15 {

public static void main(String[] args) {
    int n =5;

    for (int i = 0; i < 2*n-1; i++) {
        int space = Math.abs(n-1-i);

        for (int j = 0; j < space; j++) {
            System.out.print(" ");
            
        }
      int c  = i>n-1? 2*(n-1)-2*(i-(n-1)):2*i;

      for (int j = 0; j <=c; j++) {
        if(j==0||j==c)
        {
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
