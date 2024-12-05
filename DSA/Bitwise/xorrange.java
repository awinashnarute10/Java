package DSA.Bitwise;

public class xorrange {

    public static void main(String[] args) {
        //xor of all numbers between a and b
        // we will bascially find xor from 0 to b from %4 formula than again xor this whole with 0 to a-1 to remover the extra 0 to a-1 elements

        int a = 3;
        int b = 9;
       int ans = xor(b)^xor(a-1);
       System.out.println(ans);
        }
    
    public static int xor(int x)
    {
        if(x%4==0){
            return x;
        }
        if(x%4==1)
        {
              return 1;
        }
        if(x%4==2){
               return x+1;
        }
        else{
            return 0;
        }
    }
}
