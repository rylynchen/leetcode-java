package q206_reverse_linked_list;

/**
 * @Description:
 * @Author: liuchen created at 23:12 2020-10-22
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1);
        n4.next = n5;
        n3.next = n4;
        n2.next = n3;
        n1.next = n2;
    }
}
