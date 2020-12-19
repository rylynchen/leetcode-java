package q8_string_to_integer_atoi;

/**
 * 字符串转换整数 (atoi)
 * <p>
 * Solution:
 * <p>
 * Time:,Space:
 *
 * @Link: https://leetcode-cn.com/problems/string-to-integer-atoi/
 * @Author: liuchen created at 15:11 19/12/2020
 */
public class Solution {

    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "   -42";
        Solution s = new Solution();
        System.out.println(s.myAtoi(str));
    }
}
