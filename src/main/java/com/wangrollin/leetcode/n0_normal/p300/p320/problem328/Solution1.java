package com.wangrollin.leetcode.n0_normal.p300.p320.problem328;

/**
 * 奇偶链表
 *
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 *
 * 示例 2:
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 *
 * 说明:
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/odd-even-linked-list
 *
 * Solution1
 * 分离出来奇偶链表，再连上
 */
public class Solution1 {

    public ListNode oddEvenList(ListNode head) {

        ListNode odd = new ListNode(-1);
        ListNode curOdd = odd;
        ListNode even = new ListNode(-1);
        ListNode curEven = even;

        while (true) {

            if (head == null) {
                break;
            } else {
                curOdd.next = head;
                curOdd = curOdd.next;
                head = head.next;
                curOdd.next = null;
            }

            if (head == null) {
                break;
            } else {
                curEven.next = head;
                curEven = curEven.next;
                head = head.next;
                curEven.next = null;
            }
        }

        if (curOdd != odd && curEven != even) {
            curOdd.next = even.next;
        }
        return odd.next;
    }

    private static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}