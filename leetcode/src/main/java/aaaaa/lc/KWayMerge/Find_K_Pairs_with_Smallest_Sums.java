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
//373_Find_K_Pairs_with_Smallest_Sums.java

public class Find_K_Pairs_with_Smallest_Sums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));

        for (int i = 0; i < nums1.length; i++) {
            pq.offer(new int[] { nums1[i], nums2[0], 0 });
        }

        for (int i = 0; i < Math.min(nums1.length * nums2.length, k); i++) {
            int[] curr = pq.poll();

            List<Integer> temp = new ArrayList<>();
            temp.add(curr[0]);
            temp.add(curr[1]);

            result.add(temp);

            if (curr[2] < nums2.length - 1) {
                int idx = curr[2] + 1;
                pq.offer(new int[] { curr[0], nums2[idx], idx });
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
