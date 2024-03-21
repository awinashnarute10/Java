package DSA.BeginningtoArrays;
import java.util.Arrays;
import java.util.Scanner;

public class maximumwealth {
    public static void main(String[] args) {
        int i=0,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i");
        i = sc.nextInt();
        System.out.println("Enter j");
        j = sc.nextInt();
        sc.close();
      
        int [][] a = new int [i][j];
       for(int b = 0; b<i; b++)
       {
        for (int k = 0; k < j; k++) {
            a[b][k]= sc.nextInt();
        }
       }
       
       for (int[] ks : a) {
        System.out.println(Arrays.toString(ks));
       }      
     int max =0;
     int x = 0;
    for(int b=0; b<i;b++)
    {
         
        for(int k=0;k<j;k++)
        {
            x = x+a[b][k];
           
        }
        if(x>max)
        {
            max = x;
        }
       x = 0;
    }
    System.out.println(max);
       
    }
    
}
