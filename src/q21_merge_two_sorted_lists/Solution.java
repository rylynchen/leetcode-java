package q21_merge_two_sorted_lists;

/**
 * @Description:
 * @Author: liuchen created at 22:38 2020-10-22
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                node.next = l2;
                l2 = l2.next;
                node = node.next;
                continue;
            }
            if (l2 == null) {
                node.next = l1;
                l1 = l1.next;
                node = node.next;
                continue;
            }
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode nr4 = new ListNode(4);
        ListNode nr3 = new ListNode(3, nr4);
        ListNode nr1 = new ListNode(1, nr3);

        ListNode nl4 = new ListNode(4);
        ListNode nl2 = new ListNode(2, nl4);
        ListNode nl1 = new ListNode(1, nl2);
        Solution s = new Solution();
        s.mergeTwoLists(nl1, nr1);
    }
}
