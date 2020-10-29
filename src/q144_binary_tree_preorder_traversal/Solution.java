package q144_binary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
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
}
