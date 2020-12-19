package q58_length_of_last_word;

/**
 * 最后一个单词的长度
 * <p>
 * Solution:
 * <p>
 * Time:O(n) ,Space:O(1)
 *
 * @Link: https://leetcode-cn.com/problems/length-of-last-word/
 * @Author: liuchen created at 22:51 16/12/2020
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (len > 0) {
                    break;
                } else {
                    continue;
                }
            }
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        Solution s = new Solution();
        System.out.println(s.lengthOfLastWord(str));
    }
}
