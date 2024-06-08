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
//83_Remove_Duplicates_from_Sorted_List.java

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head, fast = head.next;

        while (curr != null) {
            while (fast != null && curr.val == fast.val) {
                fast = fast.next;
            }

            curr.next = fast;
            curr = fast;
        }

        return head;
    }
    public static void main(String[] args) {

    }
}
