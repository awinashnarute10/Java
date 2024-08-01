package DSA.recursion;

public class binarysearch {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 7, 8, 9 };
        int target = 10;
        System.out.println(binarysearching(arr, target, 0, arr.length - 1) + 1);

    }

    static int binarysearching(int[] arr, int target, int s, int e) {

        if (s > e)
            return -2;

        int mid = s + (e - s) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] > target)
            return binarysearching(arr, target, s, mid - 1);

        return binarysearching(arr, target, mid + 1, e);

    }
}
