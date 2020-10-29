package q589_n_ary_tree_preorder_traversal;

import java.util.List;

/**
 * @Description:
 * @Author: liuchen created at 22:55 2020-10-28
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
