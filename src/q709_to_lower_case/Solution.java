package q709_to_lower_case;

/**
 * 转换成小写字母
 * <p>
 * Solution:
 * <p>
 * Time:O(n), Space:O(1)
 *
 * @Link: https://leetcode-cn.com/problems/to-lower-case/
 * @Author: liuchen created at 22:34 16/12/2020
 */
public class Solution {

    public String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String str = "Hello";
        Solution s = new Solution();
        System.out.println(s.toLowerCase(str));
    }
}
