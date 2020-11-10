package q94_binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 * <p>
 * Solution: 参考 中序遍历-左根右
 * <p>
 * Time: O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * @Author: liuchen created at 22:26 2020-10-28
 */
public class Solution {

    private List<Integer> list;

    public List<Integer> inorderTraversal(TreeNode root) {
        this.list = new ArrayList<>();
        this.inOrder(root);
        return list;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        this.inOrder(root.left);
        this.list.add(root.val);
        this.inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        n2.left = n3;
        TreeNode n1 = new TreeNode(1);
        n1.right = n2;
        Solution s = new Solution();
        System.out.println(s.inorderTraversal(n1));
    }
}
