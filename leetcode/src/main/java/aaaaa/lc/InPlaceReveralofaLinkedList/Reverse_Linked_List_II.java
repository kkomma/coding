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
//92_Reverse_Linked_List_II.java

public class Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode begin = dummy;

        for (int i = 0; i < m - 1; i++) {
            begin = begin.next;
        }

        ListNode start = begin.next, then = start.next;

        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = begin.next;
            begin.next = then;
            then = start.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
