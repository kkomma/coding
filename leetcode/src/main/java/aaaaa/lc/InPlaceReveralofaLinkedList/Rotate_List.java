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
//61_Rotate_List.java

public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode runner = head;
        int len = 1;

        while (runner.next != null) {
            runner = runner.next;
            len++;
        }

        runner.next = head;

        k = k % len;

        for (int i = 0; i < (len - k); i++) {
            runner = runner.next;
        }

        head = runner.next;
        runner.next = null;
        return head;
    }
    public static void main(String[] args) {

    }
}
