package q590_n_ary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树的后序遍历
 * <p>
 * Solution: 参考 后序遍历-左右根，改为子根，即可
 *
 * @Link: https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 * @Author: liuchen created at 22:43 2020-10-28
 */
public class Solution {

    private List<Integer> list;

    public List<Integer> postorder(Node root) {
        this.list = new ArrayList<>();
        this.postOrderNode(root);
        return list;
    }

    private void postOrderNode(Node node) {
        if (node == null) {
            return;
        }
        if (node.children != null) {
            for (int i = 0; i < node.children.size(); i++) {
                this.postOrderNode(node.children.get(i));
            }
        }
        this.list.add(node.val);
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
        System.out.println(s.postorder(n1));
    }
}
