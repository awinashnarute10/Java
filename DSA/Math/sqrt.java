package DSA.Math;

public class sqrt {

    public static void main(String[] args) {
        int n = 37; // here as we will be working in a sorted number sequence therefore we will apply binary search
        int p = 3; // upto 3 decimal point prescison if not a perfect square
        System.out.printf("%.3f",sqrtwithprecision(n, p));
    
        
    }

    public static double sqrtwithprecision(int n, int p){

        int i = 0, j= n;
        while(i<=j)
        {
            int mid = i+(j-i)/2;
            if(mid*mid==n)
            {
                System.out.println("Sqrt is "+mid);
                
                return mid;
            }
            if(mid*mid>n)
            {
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        // below code will only excute if not a perfect square and prescion upto 3 decimals 

        double root  = j;
        double incr = 0.1;

        for (int k = 0; k <p; k++) {

            while (root*root<=n) {
                root+=incr;
                
            }
            root-=incr; // as when while loop breaks it is ahead of the condition by one incr so subtracting that extra incr
            incr/=10; // first 0.1 then 0.01 then 0.001 therefore 3 decimal points 
        }
        return root;

        

    }
    
}
