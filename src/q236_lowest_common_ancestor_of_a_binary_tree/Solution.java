package q236_lowest_common_ancestor_of_a_binary_tree;

/**
 * 二叉树的最近公共祖先
 * <p>
 * Solution: 将问题分解为，左右子是否含p/q，当某节点的左右分别含p/q时，级p/q最近公共祖先
 * <p>
 * Time: O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * @Author: liuchen created at 23:44 2020-11-04
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) {
            return null;
        }
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode n4 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n0 = new TreeNode(0);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        n2.left = n7;
        n2.right = n4;
        TreeNode n5 = new TreeNode(5);
        n5.left = n6;
        n5.right = n2;
        TreeNode n1 = new TreeNode(1);
        n1.left = n0;
        n1.right = n8;
        TreeNode n3 = new TreeNode(3);
        n3.left = n5;
        n3.right = n1;
        Solution s = new Solution();
        System.out.println(s.lowestCommonAncestor(n3, n5, n1));
    }
}
