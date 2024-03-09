package DSA;

public class diagonalsum {
    public static void main(String[] args) {
    int [][] mat = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
int sum=0;
                    // if(mat.length==0)
                    // {
                    //     sum=mat[0][0];
                    // }
                    // if(mat.length%2==0)
                    // {
                    //     for(int i=0; i<mat.length; i++)
                    //     {
                    //          sum = sum+mat[i][i];
            
                    //     }
                    //     for(int i=0,j=mat.length-1; i<mat.length&&j>=0; i++,j--)
                    //     {
                    //         sum = sum+mat[i][j];
                    //     }
                    // }
                    // else
                    // {
                    //     for(int i=0; i<mat.length; i++)
                    //     {
                    //          sum = sum+mat[i][i];
            
                    //     }
                    //     for(int i=0,j=mat.length-1; i<mat.length&&j>=0; i++,j--)
                    //     {
                    //         sum = sum+mat[i][j];
                    //     }
                    //     sum=sum-mat[mat.length/2][mat.length/2];
                    // }

                    // leetcode sol
                    
                           
                            int n=mat.length;
                            for(int i=0;i<mat.length;i++){
                                sum=sum+mat[i][i];
                                if((n-i-1)!=i){
                                    sum=sum+mat[i][n-i-1];
                                }
                                
                            }
                            
                            System.out.println(sum);
                        }
                    }
            
    

