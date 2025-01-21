package DSA.recursion;

public class sortedornot {

    public static void main(String[] args) {
        int[] arr  = {20, 20, 99, 98, 99, 100};
        int n = arr.length-1;
        System.out.println(isSorted(arr, n));

    }
    
    public static boolean isSorted(int[]arr, int n)
    {
        if(n<=0)
        {
            return true;
        }
        // if(arr[n]<arr[n-1]){
        //     return false;
        // }
        return arr[n]>=arr[n-1]&&isSorted(arr, n-1); 
    }
}
