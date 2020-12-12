package q22_generate_parentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 括号生成
 * <p>
 * Solution: 左括号使用数量必须大于等于右括号使用数量，当前才有效
 *
 * @Link: https://leetcode-cn.com/problems/generate-parentheses/
 * @Author: liuchen created at 23:37 2020-11-03
 */
public class Solution {

    private List<String> list;

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        generator(new StringBuffer(), 0, 0, n);
        return list;
    }

    private void generator(StringBuffer sb, int left, int right, int max) {
        if (sb.length() == max * 2) {
            list.add(sb.toString());
            return;
        }
        if (left < max) {
            sb.append('(');
            generator(sb, left + 1, right, max);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right < left) {
            sb.append(')');
            generator(sb, left, right + 1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.generateParenthesis(n).toArray()));
    }
}
