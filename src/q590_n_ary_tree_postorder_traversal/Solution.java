package q590_n_ary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
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
        for(int i = 0;i<node.children.size();i++) {
            this.postOrderNode(node.children.get(i));
        }
        this.list.add(node.val);
    }
}
