package q102_binary_tree_level_order_traversal;

import java.util.*;

/**
 * 二叉树的层序遍历
 * <p>
 * Time: O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @Author: liuchen created at 23:00 10/11/2020
 */
public class Solution2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        TreeNode n20 = new TreeNode(20);
        n20.left = n15;
        n20.right = n7;
        TreeNode n9 = new TreeNode(9);
        TreeNode n3 = new TreeNode(3);
        n3.left = n9;
        n3.right = n20;
        Solution2 s = new Solution2();
        for (List<Integer> list : s.levelOrder(n3)) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}
