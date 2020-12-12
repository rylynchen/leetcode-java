package q127_word_ladder;

import java.util.ArrayList;
import java.util.List;

/**
 * 单词接龙
 * <p>
 * Solution:
 * <p>
 * Time:, Space:
 *
 * @Link: https://leetcode-cn.com/problems/word-ladder/
 * @Author: liuchen created at 22:29 5/12/2020
 */
public class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        Solution s = new Solution();
        System.out.println(s.ladderLength(beginWord, endWord, wordList));
    }
}
