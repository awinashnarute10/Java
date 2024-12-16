package DSA.Math;

public class newtonraphsonsqrt {

    public static void main(String[] args) {
        int n = 40;

        System.out.println(sqrt(n));
    }
    
    public static double sqrt(double n)
    {
        double x = n;
        double root;
          
        while (true) {
            root = 0.5*(x+(n/x));

            if(Math.abs(root-x)<1) // this error in actual root and x 
            {
                 return root;
            }
            x = root;
            
        }
    }
}
