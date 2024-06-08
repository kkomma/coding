package aaaaa.lc.InPlaceReveralofaLinkedList;

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
//24_Swap_Nodes_in_Pairs.java

public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p0 = dummy;

        while (p0.next != null && p0.next.next != null) {
            ListNode p1 = p0.next;
            ListNode p2 = p0.next.next;

            p0.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            p0 = p1;
        }

        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
