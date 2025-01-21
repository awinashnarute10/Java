package DSA.recursion;

import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 12, 5, 6 };
        System.out.println(Arrays.toString(mergesort1(arr)));

        int[] arr1 = { 8, 3, 4, 12, 5, 6 };
        mergesort2(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] mergesort1(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergesort1(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort1(Arrays.copyOfRange(arr, mid, arr.length));

        return mix(left, right);
    }

    private static int[] mix(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (j < right.length && i < left.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;

            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) { // if rigth array is not added fully
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) { // if rigth array is not added fully
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;

    }

    public static void mergesort2(int[] arr1, int s, int e) {
        if (e - s <= 1) {
            return;
        }

        int mid = s + (e - s) / 2;
        mergesort2(arr1, s, mid);
        mergesort2(arr1, mid, e);

        mix2(arr1, s, mid, e);

    }

    private static void mix2(int[] arr1, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr1[i] < arr1[j]) {
                mix[k] = arr1[i];
                i++;
            } else {
                mix[k] = arr1[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr1[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr1[j];
            j++;
            k++;
        }

        for (int k2 = 0; k2 < mix.length; k2++) {

            arr1[s + k2] = mix[k2];

        }

    }
}
