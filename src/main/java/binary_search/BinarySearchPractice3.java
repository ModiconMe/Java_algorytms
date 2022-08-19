package binary_search;

/* https://leetcode.com/problems/valid-perfect-square/
Given a positive integer num, write a function which returns True if num is a perfect square else False.

        Follow up: Do not use any built-in library function such as sqrt.

        Example 1:

        Input: num = 16
        Output: true
        Example 2:

        Input: num = 14
        Output: false*/

public class BinarySearchPractice3 {
    public boolean isPerfectSquare(int num) {
        int min = 0;
        int max = num;
        int mid;
        while (max >= min) {
            mid = (min + max)/2;
            if (mid == (double)num/mid) { //округление все портит, поэтому кастим в double
                return true;
            } else if (mid > (double)num/mid) {
                max = mid - 1;
            } else if (mid < (double)num/mid) {
                min = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
