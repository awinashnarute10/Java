package DSA.recursion;

import java.util.Arrays;

public class trianglesumfromarr {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        sumarr(arr);

    }

    static void sumarr(int[] arr) {
        if (arr.length < 1)
            return;
        int[] arr1 = new int[arr.length - 1];

        int i = 0;
        while (i < arr.length - 1) {
            arr1[i] = arr[i] + arr[i + 1];
            i++;

        }
        sumarr(arr1);
        System.out.println(Arrays.toString(arr));
    }

}
