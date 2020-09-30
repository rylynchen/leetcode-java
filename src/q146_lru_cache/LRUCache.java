package q146_lru_cache;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: liuchen created at 16:55 2020-09-29
 */
public class LRUCache {

    int capacity;
    int maxKey;
    HashMap<Integer, Integer> map;
    HashMap<Integer, Integer> keys;
    LinkedList<Integer> linkedList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>(capacity);
        this.linkedList = new LinkedList<>();
    }

    public int get(int key) {
        if (this.map.containsKey(key)) {
            return this.map.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (this.map.containsKey(key)) {
            map.put(key, value);
            this.linkedList.add(key);
        } else {
            if (this.map.size() == capacity && !this.linkedList.isEmpty()) {
                int dropKey = this.linkedList.poll();
                this.map.remove(dropKey);
            }
            this.map.put(key, value);
            this.linkedList.add(key);
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
