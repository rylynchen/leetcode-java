package q429_n_ary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: liuchen created at 23:00 2020-10-28
 */
public class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Node> nodes = new ArrayList<>();
        nodes.add(root);
        int i = 0;
        while (nodes.size() > 0) {
            List<Integer> list = new ArrayList<>();
            for (;i < nodes.size();i++) {
                Node node = nodes.get(i);
                list.add(node.val);
                nodes.addAll(node.children);
            }
            lists.add(list);
        }
        return lists;
    }
}
