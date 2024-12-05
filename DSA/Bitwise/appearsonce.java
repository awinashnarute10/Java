package DSA.Bitwise;

public class appearsonce {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4}; //output:- 6
           System.out.println(xor(arr));
    
    }

    public static int xor(int[] arr)
    {
        int store = 0;
        for (int i = 0; i < arr.length; i++) {
            store^=arr[i];  // the logic is a^a = 0  so every number that appears twice will nullify and only the number that appears once remain
        }

        return store;
    }
    
}
