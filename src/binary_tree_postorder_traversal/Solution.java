package binary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: liuchen created at 23:18 2020-09-29
 */
public class Solution {

    private List<Integer> list;

    public List<Integer> postorderTraversal(TreeNode root) {
        this.list = new ArrayList<>();
        if (root == null) {
            return this.list;
        }
        this.help(root);
        return this.list;
    }

    private void preorderTraversal(TreeNode root) {
    }

    private void help(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            this.help(root.left);
        }
        if (root.right != null) {
            this.help(root.right);
        }
        this.list.add(root.val);
    }
}
