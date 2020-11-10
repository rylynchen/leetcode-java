package q40_zui_xiao_de_kge_shu_lcof;

import java.util.PriorityQueue;

/**
 * @Description:
 * @Author: liuchen created at 10:14 2020-10-31
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int n : arr) {
            if (queue.size() < k || queue.peek() == null) {
                queue.offer(n);
            } else {
                if (n < queue.peek()) {
                    queue.poll();
                    queue.offer(n);
                }
            }
        }
        int[] list = new int[queue.size()];
        int i = 0;
        for (int num : queue) {
            list[i++] = num;

        }
        return list;
    }
}
