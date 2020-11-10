package q242_valid_anagram;

import java.util.HashMap;

/**
 * 有效的字母异位词
 *
 * 先循环s, 生成map<k=char, v=char出现次数>
 * 再循环t, 判断char是否存在map, 不存在return false, 存在v--, v为0时，删除map.char
 * 最后map.size == 0则为true
 *
 * Time: O(2n)
 * Space: O(n)
 *
 * Optimise:(Solution2)
 *  1. 定义map长度26, 26个字母
 *  2. O(2n) -> O(n), 同时循环s和t
 *
 * @Link: https://leetcode-cn.com/problems/valid-anagram/description/
 * @Author: liuchen created at 23:04 2020-10-29
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int j = 0; j < t.length(); j++) {
            if (!map.containsKey(t.charAt(j))) {
                return false;
            }
            if (map.get(t.charAt(j)) == 1) {
                map.remove(t.charAt(j));
            } else {
                map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
            }
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));
        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution.isAnagram(s2, t2));
    }
}
