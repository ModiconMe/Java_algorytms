package binary_search;

/* https://leetcode.com/problems/search-insert-position/
Given a sorted array of distinct integers and a target value, return the index if the target is found.
        f not, return the index where it would be if it were inserted in order.
        You must write an algorithm with O(log n) runtime complexity.

        Example 1:

        Input: nums = [1,3,5,6], target = 5
        Output: 2
        Example 2:

        Input: nums = [1,3,5,6], target = 2
        Output: 1
        Example 3:

        Input: nums = [1,3,5,6], target = 7
        Output: 4*/

public class BinarySearchPractice1 {
    public static int searchInsert(int[] arr, int key) {
        int min = 0;
        int max = arr.length-1;
        int mid;
        while (max >= min) {
            mid = (min+max)/2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(BinarySearchPractice1.searchInsert(arr, 7));
    }
}
