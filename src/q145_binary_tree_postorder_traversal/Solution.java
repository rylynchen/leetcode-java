package q145_binary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        q1_two_sum.Solution s = new q1_two_sum.Solution();
        int[] keys = s.twoSum(nums, target);
        System.out.println(Arrays.toString(keys));
    }
}
