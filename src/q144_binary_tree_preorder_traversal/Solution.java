package q144_binary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 * <p>
 * Solution1: 递归, 按前序遍历-根左右
 * Solution2: 迭代
 * <p>
 * Time: O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @Author: liuchen created at 22:37 2020-10-28
 */
public class Solution {
    private List<Integer> list;

    public List<Integer> preorderTraversal(TreeNode root) {
        this.list = new ArrayList<>();
        this.preorder(root);
        return list;
    }

    private void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        this.list.add(node.val);
        this.preorder(node.left);
        this.preorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        n2.left = n3;
        TreeNode n1 = new TreeNode(1);
        n1.right = n2;
        Solution s = new Solution();
        System.out.println(s.preorderTraversal(n1));
    }
}
