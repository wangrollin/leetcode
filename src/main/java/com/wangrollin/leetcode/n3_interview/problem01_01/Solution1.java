package com.wangrollin.leetcode.n3_interview.problem01_01;

/**
 * 判定字符是否唯一
 *
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 * 输入: s = "leetcode"
 * 输出: false
 *
 * 示例 2：
 * 输入: s = "abc"
 * 输出: true
 *
 * 限制：
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-unique-lcci
 *
 * Solution1
 * stream大法
 */
public class Solution1 {

    public boolean isUnique(String astr) {

        return astr.length() == astr.chars().distinct().count();
    }
}
