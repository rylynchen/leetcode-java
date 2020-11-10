package q49_group_anagrams;

import java.util.*;

/**
 * 字母异位词分组
 * <p>
 * Solution:
 * 遍历strs, 将每个str先转换成字符统计值
 * 然后判断map<key=字符统计值,v=List中key> 是否存在
 * 存在，找到List中对应List.add(str)
 * 不存在, i++, 插入map
 * <p>
 * Time: O(nk), Space: O(nk)
 *
 * @Link: https://leetcode-cn.com/problems/group-anagrams/
 * @Author: liuchen created at 16:29 2020-10-31
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length < 1) {
            return Collections.emptyList();
        }
        HashMap<String, Integer> map = new HashMap<>(strs.length);
        List<List<String>> lists = new ArrayList<>(strs.length);
        int i = 0;
        for (String s : strs) {
            String ss = getStatisticStr(s);
            if (map.containsKey(ss)) {
                lists.get(map.get(ss)).add(s);
            } else {
                map.put(ss, i++);
                List<String> list = new ArrayList<>();
                list.add(s);
                lists.add(list);
            }
        }
        return lists;
    }

    private String getStatisticStr(String str) {
        HashMap<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution s = new Solution();
        System.out.println(s.groupAnagrams(strs));
    }
}
