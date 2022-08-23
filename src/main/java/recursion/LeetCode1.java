package recursion;

/* https://leetcode.com/problems/power-of-four/
        Given an integer n, return true if it is a power of four. Otherwise, return false.

        An integer n is a power of four, if there exists an integer x such that n == 4x.*/
public class LeetCode1 {
    public static void main(String[] args) {
        LeetCode1 leetCode1 = new LeetCode1();
        System.out.println(leetCode1.isPowerOfFour(63));
    }
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n%4!=0 || n < 1) return false;
        return isPowerOfFour(n/4);
    }
}
