package DSA.Bitwise;

public class xor {

    public static void main(String[] args) {
        int n = 5,start =0;
        System.out.println(xorOperation(n, start));
    }

    public static int xorOperation(int n, int start) {
    //     int xor = 0;
    //     for(int i =0; i<n; i++)
    //     {
    //         int opr = start+2*i;
    //         xor^=opr;
    //     }

    //     return xor;
     
    int xor = 0;
    for(int i =0; i<n; i++)
    {
        xor^= start+(i<<1); //<<1 multiplies by 2, and >>1 divides by 2
    }

    return xor;


}

    
}
