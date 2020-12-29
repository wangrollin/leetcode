package com.wangrollin.leetcode.n3_interview.problem03_04;

import java.util.Stack;

/**
 * 化栈为队
 *
 * 实现一个MyQueue类，该类用两个栈来实现一个队列。
 *
 * 示例：
 * MyQueue queue = new MyQueue();
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // 返回 1
 * queue.pop();   // 返回 1
 * queue.empty(); // 返回 false
 *
 * 说明：
 * 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 * 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-queue-using-stacks-lcci
 *
 * Solution1
 * 双栈，tailStack ｜ headStack
 */
public class Solution1 {

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    class MyQueue {

        private Stack<Integer> tailStack = new Stack<>();

        private Stack<Integer> headStack = new Stack<>();

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {

        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {

            tailStack.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {

            if (headStack.isEmpty()) {
                while (!tailStack.isEmpty()) {
                    headStack.push(tailStack.pop());
                }
            }
            return headStack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {

            if (headStack.isEmpty()) {
                while (!tailStack.isEmpty()) {
                    headStack.push(tailStack.pop());
                }
            }
            return headStack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {

            return tailStack.isEmpty() && headStack.isEmpty();
        }
    }
}