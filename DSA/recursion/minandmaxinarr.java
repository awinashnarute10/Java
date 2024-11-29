package DSA.recursion;

public class minandmaxinarr {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -60, -70, 100, 99 };
        // int i = 0;
        // int min = arr[0];
        // int max = arr[0];
        int n = arr.length;
        // System.out.println(min(arr, i, min));
        // System.out.println(max(arr, min, max));
        System.out.println(min(arr, n));
        System.out.println(max(arr, n));

    }

    static int min(int[] arr, int n) {

        // if (min < arr[i]) {
        // min = arr[i];
        // }
        // if (i == arr.length - 1) {
        // return min;
        // } else {
        // return min(arr, i + 1, min);
        // }
        if (n == 1) {
            return arr[0];
        }

        return Math.min(arr[n - 1], min(arr, n - 1));

    }

    static int max(int[] arr, int n) {
        // if (max < arr[i]) {
        // max = arr[i];
        // }
        // if (i == arr.length - 1) {
        // return max;
        // } else {
        // return max(arr, i + 1, max);
        // }
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n - 1], max(arr, n - 1));
    }
}
