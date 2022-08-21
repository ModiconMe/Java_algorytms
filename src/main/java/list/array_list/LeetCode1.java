package list.array_list;

import java.util.Arrays;
/* https://leetcode.com/problems/largest-local-values-in-a-matrix/
You are given an n x n integer matrix grid.

        Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

        maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
        In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

        Return the generated matrix.*/
public class LeetCode1 {
    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        LeetCode1 leetCode1 = new LeetCode1();
        int[][] gridLocal = leetCode1.largestLocal(grid);
        System.out.println(Arrays.deepToString(gridLocal));
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n-2][n-2];
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                maxLocal[i][j] = largest33(grid, i, j);
            }
        }
        return maxLocal;
    }
    public int largest33(int[][] grid, int str, int stolb) {
        int max = 0;
        for (int i = str; i < str+3; i++) {
            for (int j = stolb; j < stolb+3; j++) {
                if (grid[i][j] > max) max = grid[i][j];
            }
        }
        return max;
    }
}
