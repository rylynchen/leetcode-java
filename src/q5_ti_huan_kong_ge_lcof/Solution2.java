package q5_ti_huan_kong_ge_lcof;

/**
 * 剑指 Offer 05. 替换空格
 * <p>
 * Time:,Space:
 *
 * @Link: https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @Author: liuchen created at 13:24 2020-11-03
 */
public class Solution2 {

    public String replaceSpace(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res += "%20";
            } else {
                res += s.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        Solution2 solution = new Solution2();
        System.out.println(solution.replaceSpace(s));
    }
}
