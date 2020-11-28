package q222_count_complete_tree_nodes;

/**
 * 完全二叉树的节点个数
 * <p>
 * Solution1: root节点数=root.left节点数+root.right节点数+1
 * <p>
 * Time:, Space:
 *
 * @Link: https://leetcode-cn.com/problems/count-complete-tree-nodes/
 * @Author: liuchen created at 13:04 24/11/2020
 */
public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static void main(String[] args) {
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        n3.left = n6;
        TreeNode n2 = new TreeNode(2);
        n2.left = n4;
        n2.right = n5;
        TreeNode n1 = new TreeNode(1);
        n1.left = n2;
        n1.right = n3;
        Solution s = new Solution();
        System.out.println(s.countNodes(n1));
    }
}
