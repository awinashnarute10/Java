

public class pattern27 {

    public static void main(String[] args) {
        int n  = 4;
        int x =1;
        int y = n*(n+1);
        for (int i = 0; i <n; i++) {

            for (int j = 0; j <i; j++) {

                System.out.print(" ");
                
            }
            
            for (int j = 0; j <n-i; j++) {
                System.out.print(x);
                System.out.print(" ");
                x++;
            }

             for (int j = n-i-1; j>=0; j--) {
                System.out.print(y-(j));
                System.out.print(" ");
             }
            y = (y-(n-i-1))-1;
            
            System.out.println();
        }
    }
    
}
