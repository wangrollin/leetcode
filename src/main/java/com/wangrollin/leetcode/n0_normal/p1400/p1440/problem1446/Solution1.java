package com.wangrollin.leetcode.n0_normal.p1400.p1440.problem1446;

/**
 * 连续字符
 *
 * 给你一个字符串s，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 * 请你返回字符串的能量。
 *
 * 示例 1：
 * 输入：s = "leetcode"
 * 输出：2
 * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
 *
 * 示例 2：
 * 输入：s = "abbcccddddeeeeedcba"
 * 输出：5
 * 解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
 *
 * 示例 3：
 * 输入：s = "triplepillooooow"
 * 输出：5
 *
 * 示例 4：
 * 输入：s = "hooraaaaaaaaaaay"
 * 输出：11
 *
 * 示例 5：
 * 输入：s = "tourist"
 * 输出：1
 *
 * 提示：
 * 1 <= s.length <= 500
 * s只包含小写英文字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/consecutive-characters
 *
 * Solution1
 * 遍历一遍维护最大值
 */
public class Solution1 {

    public int maxPower(String s) {

        int maxLen = 0;
        int curLen = 1;
        int curChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curChar) {
                curLen++;
            } else {
                maxLen = Math.max(maxLen, curLen);
                curLen = 1;
                curChar = s.charAt(i);
            }
        }

        maxLen = Math.max(maxLen, curLen);

        return maxLen;
    }
}
