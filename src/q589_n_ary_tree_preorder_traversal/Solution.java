package q589_n_ary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
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
        for(int i=0;i<node.children.size();i++) {
            this.preOrderNode(node.children.get(i));
        }
    }
}
