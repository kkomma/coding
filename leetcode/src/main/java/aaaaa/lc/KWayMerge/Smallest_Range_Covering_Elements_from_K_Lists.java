package aaaaa.lc.KWayMerge;

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
//632_Smallest_Range_Covering_Elements_from_K_Lists.java

public class Smallest_Range_Covering_Elements_from_K_Lists {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, range = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            Element e = new Element(nums.get(i).get(0), i, 0);
            pq.offer(e);
            max = Math.max(max, nums.get(i).get(0));
        }

        int start = -1, end = -1;

        while (pq.size() == nums.size()) {
            Element e = pq.poll();

            if (max - e.val < range) {
                range = max - e.val;
                start = e.val;
                end = max;
            }

            if (e.col + 1 < nums.get(e.row).size()) {
                e.col = e.col + 1;
                e.val = nums.get(e.row).get(e.col);

                pq.offer(e);

                if (e.val > max) {
                    max = e.val;
                }
            }
        }

        return new int[] { start, end };
    }

    class Element {
        private int val;
        private int row;
        private int col;

        public Element(int v, int r, int c) {
            val = v;
            row = r;
            col = c;
        }
    }
    public static void main(String[] args) {

    }
}
