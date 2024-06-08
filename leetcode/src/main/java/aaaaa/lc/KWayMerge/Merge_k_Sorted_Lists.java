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
//23_Merge_k_Sorted_Lists.java

public class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);

        for (ListNode ln : lists) {
            if (ln != null) {
                pq.offer(ln);
            }
        }

        while (!pq.isEmpty()) {
            ListNode l = pq.poll();

            if (l.next != null) {
                pq.offer(l.next);
            }

            curr.next = l;
            curr = curr.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
