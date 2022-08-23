package sorting.selection_sort;

import java.util.Arrays;

/* https://leetcode.com/problems/merge-sorted-array/
        You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
        representing the number of elements in nums1 and nums2 respectively.

        Merge nums1 and nums2 into a single array sorted in non-decreasing order.

        The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
        To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
        and the last n elements are set to 0 and should be ignored. nums2 has a length of n.*/
public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        LeetCode1 leetCode1 = new LeetCode1();
        leetCode1.merge(nums1, m, nums2, n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        nums1 = merging(nums1, nums2);
        int max = Integer.MIN_VALUE;
        int temp = 0;
        int index = 0;
        for (int i = nums1.length - 1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (nums1[j] > max) {
                    max = nums1[j];
                    index = j;
                }
            }
            temp = nums1[i];
            nums1[i] = max;
            nums1[index] = temp;
            max = Integer.MIN_VALUE;
        }
        System.out.println(Arrays.toString(nums1));
    }
    public int[] merging(int[] nums1, int[] nums2) {
        int startIndex = nums1.length - nums2.length;
        for (int i = startIndex, j = 0; i < nums1.length && j < nums2.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        return nums1;
    }
}
