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
//116_Populating_Next_Right_Pointers_in_Each_Node.java

public class Populating_Next_Right_Pointers_in_Each_Node {
    public Node connect(Node root) {
        Node head = root, prev = root;

        while (prev != null) {
            Node curr = prev;

            while (curr != null) {
                if (curr.left != null) {
                    curr.left.next = curr.right;
                }

                if (curr.right != null && curr.next != null) {
                    curr.right.next = curr.next.left;
                }

                curr = curr.next;
            }

            prev = prev.left;
        }

        return head;
    }
    public static void main(String[] args) {

    }
}
