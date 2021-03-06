package com.wangrollin.leetcode.n0_normal.p800.p830.problem830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 较大分组的位置
 *
 * 在一个由小写字母构成的字符串S中，包含由一些连续的相同字符所构成的分组。
 * 例如，在字符串 S = "abbxxxxzyy"中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 * 我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。
 * 最终结果按照字典顺序输出。
 *
 * 示例1:
 * 输入: "abbxxxxzzy"
 * 输出: [[3,6]]
 * 解释: "xxxx" 是一个起始于 3 且终止于 6 的较大分组。
 *
 * 示例 2:
 * 输入: "abc"
 * 输出: []
 * 解释: "a","b" 和 "c" 均不是符合要求的较大分组。
 *
 * 示例 3:
 * 输入: "abcdddeeeeaabbbcd"
 * 输出: [[3,5],[6,9],[12,14]]
 * 说明:1 <= S.length <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/positions-of-large-groups
 *
 * Solution1
 * 遍历一遍
 */
public class Solution1 {

    public List<List<Integer>> largeGroupPositions(String S) {

        List<List<Integer>> result = new ArrayList<>();

        if (S == null || S.length() < 3) {
            return result;
        }

        char curChar = S.charAt(0);
        int firstIndex = 0;
        int len = 1;

        for (int i = 1; i < S.length(); i++) {

            if (S.charAt(i) == curChar) {
                len++;
            } else if (len >= 3) {
                result.add(Arrays.asList(firstIndex, firstIndex + len - 1));
                firstIndex = i;
                curChar = S.charAt(i);
                len = 1;
            } else {
                firstIndex = i;
                curChar = S.charAt(i);
                len = 1;
            }
        }

        if (len >= 3) {
            result.add(Arrays.asList(firstIndex, firstIndex + len - 1));
        }

        return result;
    }
}
