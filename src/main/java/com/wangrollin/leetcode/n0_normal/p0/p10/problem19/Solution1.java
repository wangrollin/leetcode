package com.wangrollin.leetcode.n0_normal.p0.p10.problem19;

/**
 * 删除链表的倒数第N个节点
 *
 * 给定一个链表，删除链表的倒数第n个节点，并且返回链表的头结点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * 说明：
 * 给定的 n保证是有效的。
 *
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 *
 * Solution1
 * 加一个前置节点是精髓
 */
public class Solution1 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fastNode = head;
        ListNode slowNode = head;
        ListNode preNode = new ListNode(0);
        preNode.next = head;

        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }

        while (fastNode != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
            preNode = preNode.next;
        }

        if (slowNode == head) {
            return head.next;
        } else {
            preNode.next = slowNode.next;
            return head;
        }
    }

    private static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
