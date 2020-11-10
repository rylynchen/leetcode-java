package q6_cong_wei_dao_tou_da_yin_lian_biao_lcof;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description:
 * @Author: liuchen created at 23:34 2020-11-04
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        int size = stack.size();
        int[] nums = new int[size];
        int i = 0;
        while (stack.size() > 0) {
            nums[i++] = stack.pop().val;
        }
        return nums;
    }

    public static void main(String[] args) {
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n3.next = n2;
        ListNode n1 = new ListNode(1);
        n1.next = n3;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.reversePrint(n1)));
    }
}
