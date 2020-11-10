package q105_construct_binary_tree_from_preorder_and_inorder_traversal;

import java.util.HashMap;
import java.util.Map;

/**
 * 从前序与中序遍历序列构造二叉树
 * <p>
 * Solution:将问题分解为,递归生成左右子树,根据
 * 1. 前序遍历第一个为根节点
 * 2. 找到中序遍历中的根节点key为i，其左侧为其左子树所有节点,右侧为其右子树所有节点
 * 3. 获得左子树所有节点长度left_len
 * 3. 生成左子树，preorder[0+1..0+left_len], inorder[0..i-1]
 * 4. 生成右子树, preorder[0+left_len+1..preorder.len-1], inorder[i+1..inorder.len-1]
 * <p>
 * Time: O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @Author: liuchen created at 09:52 2020-11-07
 */
public class Solution {

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        // 终止条件
        if (preorder_left > preorder_right) {
            return null;
        }
        // 首先可以确定，前序遍历(根左右)的第一个节点，就是根节点
        int preorder_root = preorder_left;
        // 建立根节点
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // 然后在中序遍历(左根右)中，确定根节点位置n, 由此可以确定inorder中[0..n-1]为左子树所有节点，[n+1..inorder.len-1]为右子树所有节点
        int inorder_root = indexMap.get(preorder[preorder_root]);
        // 计算左子树节点数
        int size_left_subtree = inorder_root - inorder_left;
        // 递归生成左子树
        root.left = helper(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // 递归生成右子树
        root.right = helper(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        Solution s = new Solution();
        System.out.println(s.buildTree(preorder, inorder));
    }
}