package q515_find_largest_value_in_each_tree_row;

import java.util.*;

/**
 * 在每个树行中找最大值
 * <p>
 * Time: O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/submissions/
 * @Author: liuchen created at 23:36 10/11/2020
 */
public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.val > max) {
                    max = node.val;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(max);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode n5 = new TreeNode(5);
        TreeNode n31 = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n32 = new TreeNode(3, n5, n31);
        TreeNode n2 = new TreeNode(2, null, n9);
        TreeNode n1 = new TreeNode(1, n32, n2);
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.largestValues(n1).toArray()));
    }
}
