package DSA.Patterns;

public class pattern24 {
    

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i < n*2; i++) {
            int x = i>n-1?2*n-i-1:i;
            for (int j = 0; j < n*2; j++) {
                if(j==0||j==x||j==n*2-1-x||j==n*2-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
                
            }
            
        }


    }

