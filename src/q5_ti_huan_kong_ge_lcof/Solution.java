package q5_ti_huan_kong_ge_lcof;

/**
 * @Description:
 * @Author: liuchen created at 13:24 2020-11-03
 */
public class Solution {

    public String replaceSpace(String s) {
        char[] chars = new char[s.length() * 3];
        int j = 0;
        for (int i = 0 ; i< s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            } else {
                chars[j++] = c;
            }
        }
        return new String(chars, 0, j);
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        Solution solution = new Solution();
        System.out.println(solution.replaceSpace(s));
    }
}
