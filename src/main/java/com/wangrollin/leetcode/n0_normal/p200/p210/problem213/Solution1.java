package com.wangrollin.leetcode.n0_normal.p200.p210.problem213;

/**
 * 打家劫舍 II
 *
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。
 * 这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。
 * 同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
 *
 * 示例1：
 * 输入：nums = [2,3,2]
 * 输出：3
 * 解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 *
 * 示例 2：
 * 输入：nums = [1,2,3,1]
 * 输出：4
 * 解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 *     偷窃到的最高金额 = 1 + 3 = 4 。
 *
 * 示例 3：
 * 输入：nums = [0]
 * 输出：0
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber-ii
 *
 * Solution1
 * f(x)表示抢了这一家的情况下，从开始到x位置的最大值
 * f(x) = max(f(x-2), f(x-3)) + arr_x
 */
public class Solution1 {

    public int rob(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length == 3) {
            return Math.max(nums[2], Math.max(nums[0], nums[1]));
        }

        // 抢了都第一家
        int first = nums[0];
        int second = 0;
        int third = nums[0] + nums[2];

        for (int i = 3; i < nums.length - 1; i++) {

            int temp = Math.max(first, second) + nums[i];
            first = second;
            second = third;
            third = temp;
        }

        int result = Math.max(second, third);

        // 没抢第一家
        first = 0;
        second = nums[1];
        third = nums[2];

        for (int i = 3; i < nums.length; i++) {

            int temp = Math.max(first, second) + nums[i];
            first = second;
            second = third;
            third = temp;
        }

        return Math.max(result, Math.max(second, third));
    }
}
