package DSA.Bitwise;

public class numberofdidgitsinbaseb {

    public static void main(String[] args) {
        int n = 6; // binary form = 110 so that output should be three
        int count = 0;
        while(n>0)
        {
            count++;
            n>>=1;
        }
        System.out.println(count);


        // here the formula is int(log with base b of number n +1 = no of digits in base b form of the number)
        // eg here n = 6 and base =2 to calculate digits in binary
        n = 6;
        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b))+1;
        System.out.println(ans);
    }
    
}
