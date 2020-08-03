package com.wangrollin.leetcode.n0_normal.p900.p920.problem925;

/**
 * 长按键入
 *
 * 你的朋友正在使用键盘输入他的名字name。偶尔，在键入字符c时，按键可能会被长按，而字符可能被输入 1 次或多次。
 * 你将会检查键盘输入的字符typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回True。
 *
 * 示例 1：
 * 输入：name = "alex", typed = "aaleex"
 * 输出：true
 * 解释：'alex' 中的 'a' 和 'e' 被长按。
 *
 * 示例 2：
 * 输入：name = "saeed", typed = "ssaaedd"
 * 输出：false
 * 解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
 *
 * 示例 3：
 * 输入：name = "leelee", typed = "lleeelee"
 * 输出：true
 *
 * 示例 4：
 * 输入：name = "laiden", typed = "laiden"
 * 输出：true
 * 解释：长按名字中的字符并不是必要的。
 *
 * 提示：
 * name.length <= 1000
 * typed.length <= 1000
 * name 和typed的字符都是小写字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/long-pressed-name
 *
 * Solution1
 * 双指针比较
 */
public class Solution1 {

    public boolean isLongPressedName(String name, String typed) {

        if (typed.length() < name.length() || name.charAt(0) != typed.charAt(0)) {
            return false;
        }
        if (typed.length() == name.length()) {
            return typed.equals(name);
        }
        if (name.length() == 1) {
            return typed.equals(name.repeat(typed.length()));
        }

        for (int i = 1, j = 1; i < name.length(); ) {
            if (j == typed.length()) {
                return false;
            }
            if (name.charAt(i) == typed.charAt(j)) {
                if (i == name.length() - 1) {
                    if (j == typed.length() - 1) {
                        return true;
                    } else {
                        return typed.substring(j)
                                .equals(String.valueOf(name.charAt(i)).repeat(typed.length() - j));
                    }
                } else {
                    i++;
                    j++;
                }
            } else if (name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }

        }

        return true;
    }
}
