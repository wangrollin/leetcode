package com.wangrollin.leetcode.n0_normal.p900.p930.problem938;

import java.util.Stack;

/**
 * 二叉搜索树的范围和
 *
 * 给定二叉搜索树的根结点root，返回 L 和 R（含）之间的所有结点的值的和。
 * 二叉搜索树保证具有唯一的值。
 *
 * 示例 1：
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 * 输出：32
 *
 * 示例2：
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * 输出：23
 *
 * 提示：
 * 树中的结点数量最多为10000个。
 * 最终的答案保证小于2^31。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/range-sum-of-bst
 *
 * Solution2
 * 迭代，实现深度优先搜索
 */
public class Solution2 {

    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null) {
            return 0;
        }

        int result = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) {
                continue;
            }
            if (node.val >= L && node.val <= R) {
                result += node.val;
                stack.push(node.right);
                stack.push(node.left);
            } else if (node.val > R) {
                stack.push(node.left);
            } else {
                stack.push(node.right);
            }
        }

        return result;
    }

    private static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
