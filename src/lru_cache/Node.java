package lru_cache;

/**
 * @Description:
 * @Author: liuchen created at 17:05 2020-09-29
 */
public class Node {
    int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
