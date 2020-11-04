package com.wangrollin.leetcode.n0_normal.p0.p60.problem64;

/**
 * 最小路径和
 *
 * 给定一个包含非负整数的 mxn网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 * 输入:
 * [
 *  [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 *
 * Solution1
 * 记忆整个矩阵，迭代
 * f(i,j)表示到当前点的路径的最小数字和
 * f(i,j) = min(f(i-1, j), f(i, j-1)) + grid[i][j]
 */
public class Solution1 {

    public int minPathSum(int[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (i - 1 >= 0 && j - 1 >= 0) {
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                } else if (i - 1 < 0 && j - 1 >= 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (i - 1 >= 0 && j - 1 < 0) {
                    grid[i][j] += grid[i - 1][j];
                }
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}
