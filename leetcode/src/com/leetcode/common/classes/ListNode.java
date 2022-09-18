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
        System.out.println();
        while (temp != null) {
            System.out.print(temp.val() + "\t");
            temp = temp.next;
        }
    }
}
