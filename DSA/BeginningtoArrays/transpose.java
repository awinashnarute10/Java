package DSA.BeginningtoArrays;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},{4,5,6}
        };
        
        
        int [][] trans = new int [matrix[0].length][matrix.length];
         
         for(int k =0; k<matrix.length;k++)
         {
            
             for(int l=0; l<matrix.length; l++)
             {
                 trans[l][k]=matrix[k][l];
                 
             }
         }
         for (int[] ks : trans) {
            System.out.println(Arrays.toString(ks));
         }

    }
}
