package com.wangrollin.leetcode.n3_interview.problem05_06;

/**
 * 整数转换
 *
 * 整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。
 *
 * 示例1:
 *  输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
 *  输出：2
 *
 * 示例2:
 *  输入：A = 1，B = 2
 *  输出：2
 *
 * 提示:
 * A，B范围在[-2147483648, 2147483647]之间
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-integer-lcci
 *
 * Solution1
 * 异或位运算，不同的位都变成了1，然后统计个数
 */
public class Solution1 {

    public static int convertInteger(int A, int B) {

        return (int) Integer
                .toBinaryString(A ^ B)
                .chars()
                .filter(i -> i == '1')
                .count();
    }
}
