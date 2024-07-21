package DSA.Patterns;

public class pattern22 {

    public static void main(String[] args) {
        int n =5;
        int s = 1;
        for (int i = 0; i < n; i++) {
          
            for (int j = 0; j <=i; j++) {
                System.out.print(s);
                if(s==1) s--;
                else s++;
                
            }
            System.out.println();

            
        }
    }
    
}
