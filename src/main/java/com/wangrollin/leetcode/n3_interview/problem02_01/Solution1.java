package com.wangrollin.leetcode.n3_interview.problem02_01;

import java.util.HashSet;
import java.util.Set;

/**
 * 移除重复节点
 *
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 *  输入：[1, 2, 3, 3, 2, 1]
 *  输出：[1, 2, 3]
 *
 * 示例2:
 *  输入：[1, 1, 1, 1, 2]
 *  输出：[1, 2]
 *
 * 提示：
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 *
 * 进阶：
 * 如果不得使用临时缓冲区，该怎么解决？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicate-node-lcci
 *
 * Solution1
 * 遍历一遍，使用set判断是否重复
 */
public class Solution1 {

    public ListNode removeDuplicateNodes(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        Set<Integer> numSet = new HashSet<>();
        ListNode curNode = head;
        numSet.add(head.val);

        while (curNode.next != null) {
            if (numSet.contains(curNode.next.val)) {
                curNode.next = curNode.next.next;
            } else {
                numSet.add(curNode.next.val);
                curNode = curNode.next;
            }
        }

        return head;
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
