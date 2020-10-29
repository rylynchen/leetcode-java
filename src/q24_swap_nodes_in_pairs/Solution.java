package q24_swap_nodes_in_pairs;

/**
 * @Description:
 * @Author: liuchen created at 23:05 2020-10-21
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        Solution s = new Solution();
        ListNode n = s.swapPairs(n1);
        System.out.println(n);
    }
}
