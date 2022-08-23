package sorting.selection_sort;

import java.util.Arrays;

/* https://leetcode.com/problems/squares-of-a-sorted-array/
Given an integer array nums sorted in non-decreasing order,
        return an array of the squares of each number sorted in non-decreasing order.
*/
public class LeetCode2 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        LeetCode2 leetCode2 = new LeetCode2();
        System.out.println(Arrays.toString(leetCode2.sortedSquares(nums)));
    }
    public int[] sortedSquares(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int temp = 0;
        nums = squareArray(nums);
        for (int i = nums.length-1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (Math.abs(nums[j]) > max) {
                    max = Math.abs(nums[j]);
                    index = j;
                }
            }
            temp = Math.abs(nums[i]);
            nums[i] = max;
            nums[index] = temp;
            max = Integer.MIN_VALUE;
        }
        return nums;
    }
    public int[] squareArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }
}
