package q242_valid_anagram;

import java.util.HashMap;

/**
 * @Description:
 * @Author: liuchen created at 23:04 2020-10-29
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>(s.length());
        for(int i = 0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int j = 0;j<t.length();j++) {
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
}
