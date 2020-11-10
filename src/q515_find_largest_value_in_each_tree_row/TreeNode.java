package q515_find_largest_value_in_each_tree_row;

/**
 * @Description:
 * @Author: liuchen created at 23:37 10/11/2020
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
