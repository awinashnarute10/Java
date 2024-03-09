package DSA;

import java.util.Arrays;

public class flippingandinvertingimage {
    public static void main(String[] args) {
        // int [][] image = {{1,1,0},
        //                   {1,0,1},
        //                   {0,0,0}};
         
        int [][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        for(int i = 0; i<image.length;i++)
        {
            for(int j =0; j<image[i].length/2; j++)
            {
                
                     int n = image[i][j];
                     image[i][j]=image[i][image[i].length-j-1];
                     image[i][image[i].length-j-1]=n;
               
            
            }
        }    

            for(int i =0; i<image.length; i++)
            {
                for(int j=0; j<image[i].length;j++)
                {
                    if(image[i][j]==0)
                    {
                        image[i][j]=1;
                    }
                    else{
                        image[i][j]=0;
                    }
                }
            }
            System.out.println(Arrays.toString(image[0]));
            System.out.println(Arrays.toString(image[1]));
            System.out.println(Arrays.toString(image[2]));
 

    }
    
}
