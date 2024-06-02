package DSA.Searching;

public class peakindexinmountainarray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakindex(arr));
    }
    static int peakindex(int[] arr)
    {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                high = mid;
            }
        }

        return low;
        
    }
}
