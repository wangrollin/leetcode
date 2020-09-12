package com.wangrollin.leetcode.n0_normal.p500.p580.problem589;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树的前序遍历
 *
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 说明:递归法很简单，你可以使用迭代法完成此题吗?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal
 *
 * Solution1
 * 深度优先遍历，DFS，递归
 */
public class Solution1 {

    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<>();
        doPreorder(root, result);
        return result;
    }

    private void doPreorder(Node node, List<Integer> result) {

        if (node == null) {
            return;
        }
        result.add(node.val);
        node.children.forEach(child -> doPreorder(child, result));
    }

    private static class Node {

        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
