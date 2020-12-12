package q208_implement_trie_prefix_tree;

/**
 * 实现 Trie (前缀树)
 * <p>
 * Solution:
 * <p>
 * Time:,Space:
 *
 * @Link: https://leetcode-cn.com/problems/implement-trie-prefix-tree/
 * @Author: liuchen created at 21:26 6/12/2020
 */
public class Solution {

    public static void main(String[] args) {
        String word = "apple";
        String prefix = "app";
        Trie trie = new Trie();
        trie.insert(word);
        System.out.println(trie.search(word));
        System.out.println(trie.search(prefix));
        System.out.println(trie.startsWith(prefix));
    }
}
