package com.wangrollin.leetcode.n0_normal.p800.p840.problem849;

import java.util.Arrays;

/**
 * 到最近的人的最大距离
 *
 * 在一排座位（seats）中，1代表有人坐在座位上，0代表座位上是空的。
 * 至少有一个空座位，且至少有一人坐在座位上。
 * 亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
 * 返回他到离他最近的人的最大距离。
 *
 * 示例 1：
 * 输入：[1,0,0,0,1,0,1]
 * 输出：2
 * 解释：
 * 如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
 * 如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
 * 因此，他到离他最近的人的最大距离是 2 。
 *
 * 示例 2：
 * 输入：[1,0,0,0]
 * 输出：3
 * 解释：
 * 如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
 * 这是可能的最大距离，所以答案是 3 。
 *
 * 提示：
 * 1 <= seats.length <= 20000
 * seats中只含有 0 和 1，至少有一个 0，且至少有一个 1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximize-distance-to-closest-person
 *
 * Solution1
 * 工业党的原则：可维护性大于性能表现
 */
public class Solution1 {

    public int maxDistToClosest(int[] seats) {

        StringBuilder sb = new StringBuilder();
        Arrays.stream(seats).forEach(sb::append);

        int maxLenOfZero =
                Arrays.stream(sb.toString().split("[1]+"))
                        .mapToInt(String::length)
                        .max()
                        .getAsInt();

        int resultCandidate0 = (maxLenOfZero + 1) / 2;
        int resultCandidate1 = sb.toString().indexOf('1');
        int resultCandidate2 = sb.length() - 1 - sb.toString().lastIndexOf('1');

        return Math.max(Math.max(resultCandidate0, resultCandidate1), resultCandidate2);
    }
}
