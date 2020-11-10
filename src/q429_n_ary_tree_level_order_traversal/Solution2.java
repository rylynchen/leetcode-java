package q429_n_ary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuchen created at 23:00 2020-10-28
 */
public class Solution2 {

    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        if (root != null) {
            traverseNode(root, 0);
        }
        return lists;
    }

    private void traverseNode(Node node, int level) {
        if (lists.size() <= level) {
            lists.add(new ArrayList<>());
        }
        lists.get(level).add(node.val);
        if (node.children != null) {
            for (Node child : node.children) {
                traverseNode(child, level + 1);
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
        Solution2 s = new Solution2();
        System.out.println(s.levelOrder(n1));
    }
}
