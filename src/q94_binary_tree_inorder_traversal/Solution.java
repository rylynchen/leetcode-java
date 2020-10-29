package q94_binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
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
}
