package q94_binary_tree_inorder_traversal;

/**
 * @Description:
 * @Author: liuchen created at 22:26 2020-10-28
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
