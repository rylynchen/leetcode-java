package q429_n_ary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * N叉树的层序遍历
 * <p>
 * Solution: 从顶逐层遍历
 * Solution2: 迭代, 逐个将子遍历到端点
 * <p>
 * Time:O(n), Space:O(n)
 *
 * @Link: https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
 * @Author: liuchen created at 23:00 2020-10-28
 */
public class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Node> nodes = new ArrayList<>();
        nodes.add(root);
        int i = 0;
        List<List<Integer>> lists = new ArrayList<>();
        while (i < nodes.size()) {
            List<Integer> list = new ArrayList<>();
            int len = nodes.size();
            for (; i < len; i++) {
                Node node = nodes.get(i);
                list.add(node.val);
                if (node.children != null) {
                    nodes.addAll(node.children);
                }
            }
            lists.add(list);
        }
        return lists;
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
        System.out.println(s.levelOrder(n1));
    }
}
