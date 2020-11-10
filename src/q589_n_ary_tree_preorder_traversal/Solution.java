package q589_n_ary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树的前序遍历
 * <p>
 * Solution: 参考 前序遍历-根左右，改为根子，即可
 *
 * @Link: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 * @Author: liuchen created at 22:56 2020-10-28
 */
public class Solution {

    private List<Integer> list;

    public List<Integer> preorder(Node root) {
        this.list = new ArrayList<>();
        this.preOrderNode(root);
        return this.list;
    }

    private void preOrderNode(Node node) {
        if (node == null) {
            return;
        }
        this.list.add(node.val);
        if (node.children != null) {
            for (int i = 0; i < node.children.size(); i++) {
                this.preOrderNode(node.children.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        List<Node> n3Children = new ArrayList<>(2);
        n3Children.add(n5);
        n3Children.add(n6);
        Node n3 = new Node(3, n3Children);
        Node n2 = new Node(2);
        Node n4 = new Node(4);
        List<Node> n1Children = new ArrayList<>(3);
        n1Children.add(n3);
        n1Children.add(n2);
        n1Children.add(n4);
        Node n1 = new Node(1, n1Children);
        Solution s = new Solution();
        System.out.println(s.preorder(n1));
    }
}
