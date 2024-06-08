package aaaaa.lc.FastSlowPointers;

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
//23_Merge_K_Sorted_Lists.java

public class Merge_K_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (ListNode l : lists) {
            if (l != null) {
                minHeap.add(l);
            }
        }

        while (!minHeap.isEmpty()) {
            curr.next = minHeap.poll();
            curr = curr.next;

            if (curr.next != null) {
                minHeap.add(curr.next);
            }
        }

        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
