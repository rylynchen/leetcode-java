package binary_tree_postorder_traversal;

import java.util.List;

/**
 * @Description:
 * @Author: liuchen created at 23:22 2020-09-29
 */
public class Main {

    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode n1 = new TreeNode(1, null, n2);
        Solution s = new Solution();
        List<Integer> list = s.postorderTraversal(n1);
        System.out.println(list);
    }
}
