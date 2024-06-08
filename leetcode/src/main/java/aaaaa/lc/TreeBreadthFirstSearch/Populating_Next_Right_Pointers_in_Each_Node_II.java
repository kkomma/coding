package aaaaa.lc.TreeBreadthFirstSearch;

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
//117_Populating_Next_Right_Pointers_in_Each_Node_II.java

public class Populating_Next_Right_Pointers_in_Each_Node_II {
    public Node connect(Node root) {
        Node head = root, dummy = new Node(), prev = dummy;

        while (root != null) {
            if (root.left != null) {
                prev.next = root.left;
                prev = prev.next;
            }

            if (root.right != null) {
                prev.next = root.right;
                prev = prev.next;
            }

            root = root.next;

            if (root == null) {
                root = dummy.next;
                prev = dummy;
                dummy.next = null;
            }
        }

        return head;
    }
    public static void main(String[] args) {

    }
}
