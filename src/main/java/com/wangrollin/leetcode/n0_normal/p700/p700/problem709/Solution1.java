package com.wangrollin.leetcode.n0_normal.p700.p700.problem709;

/**
 * 转换成小写字母
 *
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
 * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 * 示例 1：
 * 输入: "Hello"
 * 输出: "hello"
 *
 * 示例 2：
 * 输入: "here"
 * 输出: "here"
 *
 * 示例3：
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/to-lower-case
 *
 * Solution1
 * 遍历一遍
 */
public class Solution1 {

    public String toLowerCase(String str) {

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 'a' - 'A';
            }
        }
        return new String(chars);
    }
}
