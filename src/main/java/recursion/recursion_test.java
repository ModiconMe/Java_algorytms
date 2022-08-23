package recursion;

import java.util.Arrays;

public class recursion_test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
        System.out.println(length(arr));
        System.out.println(max(arr));
    }
    static int sum(int[] arr) {
        int res = 0;
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];
        res = arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        return res;
    }
    static int length(int[] arr) {
        int res;
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1;
        res = 1 + length(Arrays.copyOfRange(arr, 1, arr.length));
        return res;
    }
    static int max(int[] arr) {
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];
        int res = arr[0];
        if (arr[1] > res) {
            arr = Arrays.copyOfRange(arr, 1, arr.length);
            res = max(arr);
        }
        return res;
    }
}
