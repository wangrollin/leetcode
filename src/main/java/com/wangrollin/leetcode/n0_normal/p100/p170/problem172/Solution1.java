package com.wangrollin.leetcode.n0_normal.p100.p170.problem172;

/**
 * 阶乘后的零
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 示例 1:
 * 输入: 3
 * 输出: 0
 * 解释:3! = 6, 尾数中没有零。
 *
 * 示例2:
 * 输入: 5
 * 输出: 1
 * 解释:5! = 120, 尾数中有 1 个零.
 *
 * 说明: 你算法的时间复杂度应为O(logn)。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/factorial-trailing-zeroes
 *
 * Solution1
 * 0的个数和5的个数一样,但不能暴力求5，否则会超时，31! = [1*5,2*5,3*5,4*5,5*5,6*5],1+1+1+1+2+1
 */
public class Solution1 {

    public int trailingZeroes(int n) {

        int result = 0;
        while (n >= 5) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }
}