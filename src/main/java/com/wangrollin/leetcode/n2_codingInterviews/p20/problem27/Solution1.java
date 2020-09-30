package com.wangrollin.leetcode.n2_codingInterviews.p20.problem27;

/**
 * 二叉树的镜像
 *
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 例如输入：
 *   4
 *  /  \
 *  2   7
 * / \  / \
 * 1  3 6  9
 * 镜像输出：
 *   4
 *  /  \
 *  7   2
 * / \  / \
 * 9  6 3 1
 *
 * 示例 1：
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 *
 * 限制：
 * 0 <= 节点个数 <= 1000
 *
 * 注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof
 *
 * Solution1
 * 深度优先遍历，DFS，递归
 */
public class Solution1 {

    public TreeNode mirrorTree(TreeNode root) {

        if (root != null) {
            mirrorTree(root.left);
            mirrorTree((root.right));
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        return root;
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
