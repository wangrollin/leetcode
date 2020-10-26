package com.wangrollin.leetcode.n0_normal.p0.p50.problem53;

/**
 * 最大子序和
 *
 * 给定一个整数数组 nums，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释:连续子数组[4,-1,2,1] 的和最大，为6。
 *
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 *
 * Solution1
 * 动态规划，迭代，状态转移方程 以下标n结尾的最大和：f(n) = max{arr[n] + f(n-1), arr[n]}
 */
public class Solution1 {

    public int maxSubArray(int[] nums) {

        int pre = 0;
        int maxAns = nums[0];

        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxAns = Math.max(maxAns, pre);
        }

        return maxAns;
    }
}
