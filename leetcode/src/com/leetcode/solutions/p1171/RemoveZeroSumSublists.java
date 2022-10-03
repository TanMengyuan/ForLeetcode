package p1171;

import classes.ListNode;

/**
 * @author mengyuantan
 * @date 2022/10/3 13:30
 */
public class RemoveZeroSumSublists {

    // todo: NOT FINISH https://leetcode.cn/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
    static class Solution {
        public static ListNode removeZeroSumSublists(ListNode head) {
            return null;
        }
    }

    public static void main(String[] args) {
        ListNode input1 = ListNode.arrayToListNode(new int[] {1, 2, -3, 3, 1});
        // [3, 1] or [1, 2, 1]
        ListNode.printList(Solution.removeZeroSumSublists(input1));

        ListNode input2 = ListNode.arrayToListNode(new int[] {1, 2, 3, -3, 4});
        // [1, 2, 4]
        ListNode.printList(Solution.removeZeroSumSublists(input2));

        ListNode input3 = ListNode.arrayToListNode(new int[] {1, 2, 3, -3, -2});
        // [1]
        ListNode.printList(Solution.removeZeroSumSublists(input3));
    }
}
