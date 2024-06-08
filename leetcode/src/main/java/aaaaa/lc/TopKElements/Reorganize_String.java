package aaaaa.lc.TopKElements;

import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
//767_Reorganize_String.java

public class Reorganize_String {
    public String reorganizeString(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (char c : S.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);

            if (hm.get(c) > (S.length() + 1) / 2) {
                return "";
            }
        }

        for (char key : hm.keySet()) {
            pq.offer(new int[] { key, hm.get(key) });
        }

        StringBuilder sb = new StringBuilder();
        int[] prev = new int[] { -1, 0 };

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            if (--prev[1] > 0) {
                pq.offer(prev);
            }

            sb.append((char) curr[0]);
            prev = curr;
        }

        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
