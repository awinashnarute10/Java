package DSA.Sorting;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,4,5,6};
        int target = 4;
        int ans = binarysearch(arrs, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target)
    {
        int start = 0, end = arr.length;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if (target<arr[mid]) {
                end = mid-1;
                
            }
            else if (target>arr[mid]) {
                start = mid+1;
                
            } 
            else if (target==arr[mid]) {
                return mid;
                
            }
        }
        return -1;
    }
    
}
