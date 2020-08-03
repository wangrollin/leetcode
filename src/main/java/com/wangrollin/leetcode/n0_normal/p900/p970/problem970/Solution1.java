package com.wangrollin.leetcode.n0_normal.p900.p970.problem970;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 强整数
 *
 * 给定两个正整数 x 和 y，如果某一整数等于 x^i + y^j，其中整数i >= 0 且j >= 0，那么我们认为该整数是一个强整数。
 * 返回值小于或等于bound的所有强整数组成的列表。
 * 你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。
 *
 * 示例 1：
 * 输入：x = 2, y = 3, bound = 10
 * 输出：[2,3,4,5,7,9,10]
 * 解释：
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 *
 * 示例2：
 * 输入：x = 3, y = 5, bound = 15
 * 输出：[2,4,6,8,10,14]
 *
 * 提示：
 * 1 <= x <= 100
 * 1 <= y<= 100
 * 0 <= bound<= 10^6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/powerful-integers
 *
 * Solution1
 * 小心x y 为1，在不越界的情况下硬算
 */
public class Solution1 {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i <= 19 && Math.pow(x, i) <= bound; i++) {
            for (int j = 0; j <= 19 && Math.pow(x, i) + Math.pow(y, j) <= bound; j++) {
                result.add((int) Math.pow(x, i) + (int) Math.pow(y, j));
            }
        }
        return new ArrayList<>(result);
    }
}