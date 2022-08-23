package quick_sort;

import java.util.Arrays;

public class BaseQuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int left, int right) {
        if (arr.length == 0) return;
        if (left >= right) return;

        int hold = (left + right)/2;
        int l = left;
        int r = right;

        while (r >= l) {
            while (arr[hold] > arr[l]) {
                l++;
            }
            while (arr[hold] < arr[r]) {
                r--;
            }
            if (r >= l) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        if (r > left) {
            quickSort(arr, left, r);
        }
        if (l < right) {
            quickSort(arr, l, right);
        }
    }
}
