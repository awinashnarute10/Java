package DSA.recursion;

public class powerofthree {

    public static void main(String[] args) {
        int num = 81;
        System.out.println(isPowerOfThree(num));
           

    }

    public static boolean isPowerOfThree(int num)
    {
        if(num==1)
        {
            return true;
        }
        if(num%3!=0){
            return false;
        }

        return isPowerOfThree(num/3);

    }
    
}
