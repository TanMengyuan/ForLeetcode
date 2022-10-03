package classes;

/**
 * @author mengyuantan
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int i) {
        this.val = i;
    }

    public ListNode() {

    }

    public int val() {
        return val;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val() + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode arrayToListNode(int[] nums) {
        if (nums.length < 1) {
            return null;
        }

        ListNode head = new ListNode(nums[0]);
        ListNode last = head;

        for (int i = 1; i < nums.length; i ++) {
            ListNode cur = new ListNode(nums[i]);
            last.next = cur;
            last = cur;
        }

        return head;
    }
}
