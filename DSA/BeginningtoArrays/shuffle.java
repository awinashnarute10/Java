package DSA.BeginningtoArrays;
import java.util.Arrays;
import java.util.Scanner;

public class shuffle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         System.out.println("Enter half the length of array");
        int [] a = new int[2*n];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
    //     int [] x = new int[n];
    //     int [] y = new int[n];
    //     for(int i = 0; i<n;i++)
    //     {
    //         x[i]=a[i];
    //         y[i]=a[i+n];
    //     }
    //     System.out.println(Arrays.toString(x));
    //     System.out.println(Arrays.toString(y));
    //     for(int i = 0,j=0;j<n;j++)
    //     {
    //         a[i++]=x[j];
            
    //         a[i++]=y[j];
    
    //     }
    //    System.out.println(Arrays.toString(a));

      //Leetcode solution   [2,5,1,3,4,7]
       int [] res = new int[a.length];
       for (int i = 0,j=0; i <n; i++) {
        res[j++] = a[i];
        res[j++] = a[i+n];
        
       }
       System.out.println(Arrays.toString(res));

    }
}
