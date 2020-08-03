package com.wangrollin.leetcode.n0_normal.p1100.p1180.problem1184;

/**
 * 公交站间的距离
 *
 * 环形公交路线上有n个站，按次序从0到n - 1进行编号。
 * 我们已知每一对相邻公交站之间的距离，distance[i]表示编号为i的车站和编号为(i + 1) % n的车站之间的距离。
 * 环线上的公交车都可以按顺时针和逆时针的方向行驶。
 * 返回乘客从出发点start到目的地destination之间的最短距离。
 *
 * 示例 1：
 * 输入：distance = [1,2,3,4], start = 0, destination = 1
 * 输出：1
 * 解释：公交站 0 和 1 之间的距离是 1 或 9，最小值是 1。
 *
 * 示例 2：
 * 输入：distance = [1,2,3,4], start = 0, destination = 2
 * 输出：3
 * 解释：公交站 0 和 2 之间的距离是 3 或 7，最小值是 3。
 *
 * 示例 3：
 * 输入：distance = [1,2,3,4], start = 0, destination = 3
 * 输出：4
 * 解释：公交站 0 和 3 之间的距离是 6 或 4，最小值是 4。
 *
 * 提示：
 * 1 <= n<= 10^4
 * distance.length == n
 * 0 <= start, destination < n
 * 0 <= distance[i] <= 10^4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-absolute-difference
 *
 * Solution1
 * naive算法
 */
public class Solution1 {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if (start == destination) {
            return 0;
        }

        int left = Math.min(start, destination);
        int right = Math.max(start, destination);

        int innerDistance = 0;
        int outerDistance = 0;

        for (int i = 0; i < distance.length; i++) {
            if (i < left || i >= right) {
                outerDistance += distance[i];
            } else {
                innerDistance += distance[i];
            }
        }

        return Math.min(outerDistance, innerDistance);
    }
}
