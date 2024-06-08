import java.util.*;
/**
 * Given a node from a cyclic linked list which is sorted in ascending order,
 * write a function to insert a value into the list such that it remains a
 * cyclic sorted list. The given node can be a reference to any single node in
 * the list, and may not be necessarily the smallest value in the cyclic list.
 * 
 * If there are multiple suitable places for insertion, you may choose any
 * place to insert the new value. After the insertion, the cyclic list should
 * remain sorted.
 * 
 * If the list is empty (i.e., given node is null), you should create a new
 * single cyclic list and return the reference to that single node.
 * 
 * Otherwise, you should return the original given node.
 * 
 * The following example may help you understand the problem better:
 * https://leetcode.com/static/images/problemset/InsertCyclicBefore.png
 * 
 * In the figure above, there is a cyclic sorted list of three elements. You
 * are given a reference to the node with value 3, and we need to insert 2
 * into the list.
 * https://leetcode.com/static/images/problemset/InsertCyclicAfter.png
 * 
 * The new node should insert between node 1 and node 3. After the insertion,
 * the list should look like this, and we should still return node 3.
 */


// Definition for a Node6.
class Node6 {
    public int val;
    public Node6 next;

    public Node6() {}

    public Node6(int _val,Node6 _next) {
        val = _val;
        next = _next;
    }
};


public class InsertIntoACyclicSortedList {
    public Node6 insert(Node6 head, int insertVal) {
        Node6 newNoode = new Node6(insertVal, null);
        if (head == null) {
            newNoode.next = newNoode;
            return newNoode;
        }
        
        Node6 p = head;
        boolean inserted = false;
        do {
            if (p == p.next || p.val == insertVal || (p.val < insertVal && p.next.val > insertVal) ||
                    (((p.val > insertVal && p.next.val > insertVal) || (p.val < insertVal && p.next.val < insertVal)) && p.next.val < p.val)) {
                newNoode.next = p.next;
                p.next = newNoode;
                inserted = true;
                break;
            }
            p = p.next;
        } while (p != head);
        if (!inserted) {
            newNoode.next = p.next;
            p.next = newNoode;
        }
        return head;
    }


    public Node6 insert2(Node6 head, int insertVal) {
        Node6 newNoode = new Node6();
        newNoode.val = insertVal;
        if (head == null) {
            newNoode.next = newNoode;
            return newNoode;
        }
        Node6 p = head;
        Node6 dec = null;
        while (true) {
            if (p.val <= insertVal && p.next.val >= insertVal) {
                newNoode.next = p.next;
                p.next = newNoode;
                return head;
            }
            if (p.val > p.next.val) {
                dec = p;
            }
            p = p.next;
            if (p == head) break;
        }
        if (dec == null) dec = head;
        newNoode.next = dec.next;
        dec.next = newNoode;
        return head;
    }

}
