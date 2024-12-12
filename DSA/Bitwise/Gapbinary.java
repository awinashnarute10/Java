package DSA.Bitwise;

public class Gapbinary {

    public static void main(String[] args) {
        int n = 22;
        System.out.println(binaryGap(n));
    }

    public static int binaryGap(int n) {
        int maxDistance = 0;
        int pos = 0;
        int last = -1;
        while(n>0)
        {
            if((n&1)==1)
            {
               if(last!=-1)
               {
                maxDistance = Math.max(maxDistance,pos-last);
               }
               last = pos;
            }
            n>>=1;
            pos++;
        }

        return maxDistance;
    }
    
}
