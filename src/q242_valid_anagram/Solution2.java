package q242_valid_anagram;

import java.util.HashMap;

/**
 * @Description:
 * @Author: liuchen created at 23:04 2020-10-29
 */
public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (sc == tc) {
                continue;
            }
            if (map.containsKey(sc)) {
                if (map.get(sc) == -1) {
                    map.remove(sc);
                } else {
                    map.put(sc, map.get(sc) + 1);
                }
            } else {
                map.put(sc, 1);
            }
            if (map.containsKey(tc)) {
                if (map.get(tc) == 1) {
                    map.remove(tc);
                } else {
                    map.put(tc, map.get(tc) - 1);
                }
            } else {
                map.put(tc, -1);
            }
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isAnagram(s, t));
        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution2.isAnagram(s2, t2));
    }
}
