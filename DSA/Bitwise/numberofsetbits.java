package DSA.Bitwise;

public class numberofsetbits {

    public static void main(String[] args) {
        // logic is that first we will n&-n so that right most set bit is isolated and subtract it from the n therefore subtracting right most set bit and continue this loop till n==0 and the number of times it iterates is the answer

        int n = 45; // 1001 so output = 2
        int count = 0;
        while(n>0)
        {
          n =  n-(n&(-n));
          count++;
        }

        System.out.println(count);
    }
    
}
