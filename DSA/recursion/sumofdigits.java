package DSA.recursion;

public class sumofdigits {

    public static void main(String[] args) {
        int num = 45632; // output:- 20
        
        System.out.println(sumofdidgits(num));
    }
    
    public static int sumofdidgits(int num)
    {
        if(num==0)
        {
            return 0;
        }
        
        return num%10+sumofdidgits(num/10);
    }
}
