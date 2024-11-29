package DSA.recursion;

public class isprime {

    public static void main(String[] args) {
        int num = 11;
        int i = 3;
        System.out.println(check(num, i));
        
    }
    
    public static boolean check(int num, int i)
    {
        if(num==0|| num==1)
        {
            return false;
        }
        if(num==2)
        {
            return true;
        }

        if(num/i==0)
        {
            return false;
        }
        if(i*i>num)
        {
            return true;
        }
        return check(num, i+1);
        
    }
}
