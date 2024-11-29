package DSA.recursion;

public class product {

    public static void main(String[] args) {
        int x = 5;
        int y  = 100;
        System.out.println(times(x, y));

    }

    public static int  times(int x, int y)
    {
        if(x<y)
        {
            return times(y, x);
        }
        if(y==0)
        {
            return 0;
        }

        return x+times(x,y-1);
    }
    
}
