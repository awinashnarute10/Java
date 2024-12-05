package DSA.Bitwise;

public class xortillb {

    public static void main(String[] args) {
        //xor of all number till b

        int b = 2;

        if(b%4==0)
        {
            System.out.println(b);
        }
        if(b%4==1)
        {
            System.out.println(1);
        }
        if(b%4==2)
        {
            System.out.println(b+1);
        }
        else{
            System.out.println(0);
        }
    }
    
}
