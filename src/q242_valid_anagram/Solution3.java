package q242_valid_anagram;

import java.util.HashMap;

/**
 * 有效的字母异位词
 *
 * @Link: https://leetcode-cn.com/problems/valid-anagram/
 * @Author: liuchen created at 23:04 2020-10-29
 */
public class Solution3 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                map.put(t.charAt(i), -1);
            }
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 0) {
                map.remove(s.charAt(i));
            }
            if (map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) == 0) {
                map.remove(t.charAt(i));
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Solution3 solution2 = new Solution3();
        System.out.println(solution2.isAnagram(s, t));
        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution2.isAnagram(s2, t2));
    }
}
