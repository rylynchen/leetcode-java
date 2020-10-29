package q234_palindrome_linked_list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: liuchen created at 23:35 2020-10-23
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            vals.add(node.val);
            node = node.next;
        }
        int i = 0;
        int j = vals.size() - 1;
        while (i < j) {
            if (!vals.get(i).equals(vals.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(-129);
        ListNode n2 = new ListNode(-129);
        n1.next = n2;
        Solution s = new Solution();
        System.out.println(s.isPalindrome(n1));
    }
}
