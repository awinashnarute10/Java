package DSA.recursion;

public class binarysearch {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,17};
        int target = 17;
        int s = 0;
        int e = num.length-1;

        System.out.println(binarysearching(num, s, e, target)+1);
    }

    static int binarysearching(int[] num, int s, int e, int target){
        int midd = (s+e)/2;

        if(num[midd]==target)
        {
            return midd;
        }

        if(num[midd]>target){
            return binarysearching(num, s, e-1, target);
        }
        return binarysearching(num, s+1, e, target);
    }
}
