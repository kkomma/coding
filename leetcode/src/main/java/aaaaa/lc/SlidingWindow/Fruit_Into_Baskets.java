package aaaaa.lc.SlidingWindow;

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
//904_Fruit_Into_Baskets.java

public class Fruit_Into_Baskets {
    public int totalFruit(int[] tree) {
        if (tree == null || tree.length == 0) {
            return 0;
        }

        int start = 0, end = 0, result = 0;
        Map<Integer, Integer> hm = new HashMap<>();

        while (end < tree.length) {
            hm.put(tree[end], end++);

            if (hm.size() > 2) {
                int minIdx = Collections.min(hm.values());
                start = minIdx + 1;

                hm.remove(tree[minIdx]);
            }

            result = Math.max(result, end - start);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
