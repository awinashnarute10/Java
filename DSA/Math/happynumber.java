package DSA.Math;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class happynumber {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

     public static boolean isHappy(int n) {
        // ArrayList<Integer> container = new ArrayList<>();

        // int sum = 0;
        // while(sum!=1){
        //     sum = 0;
        //     while(n!=0)
        //     {
        //         sum+=Math.pow(n%10,2);
        //         n/=10;
        //     }
        //     if(container.contains(sum))
        //     {
        //         return false;
        //     }
        //     container.add(sum);
        //     n = sum;
        // }
        // return true;

        int fast = n;
        int slow = n;

        do {
            slow = square(slow);  // will only jump 1 point at a time
            fast = square(square(fast)); // will jump 2 points at a time
            
        } while (slow!=fast);

        return slow==1;
    }

    public static int square(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum+= Math.pow(n%10, 2);
            n/=10;
        }
        return sum;
    }
    
}
