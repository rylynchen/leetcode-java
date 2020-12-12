package q22_generate_parentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 括号生成
 * <p>
 * Solution: DFS+剪枝, 核心思路-当前使用的左括号数量>=当前使用的右括号数量才算有效，否则进行剪枝
 * <p>
 * Time: O(n^n) ??, Space:O(n)
 *
 * @Link: https://leetcode-cn.com/problems/generate-parentheses/
 * @Author: liuchen created at 23:37 2020-11-03
 */
public class Solution2 {

    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return Collections.emptyList();
        }
        List<String> list = new ArrayList<>();
        dfs("", n, n, list);
        return list;
    }

    /**
     * DFS
     *
     * @param curStr 当前递归得到结果
     * @param left   左括号剩余数量
     * @param right  右括号剩余数量
     * @param list   结果集
     */
    private void dfs(String curStr, int left, int right, List<String> list) {
        if (left == 0 && right == 0) {
            list.add(curStr);
            return;
        }
        // 剪枝
        if (left > right) {
            return;
        }
        if (left > 0) {
            dfs(curStr + "(", left - 1, right, list);
        }
        if (right > 0) {
            dfs(curStr + ")", left, right - 1, list);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.generateParenthesis(n).toArray()));
    }
}
