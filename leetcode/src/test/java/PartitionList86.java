import java.util.*;
/**
 * Given a linked list and a value x, partition it such that all nodes less
 * than x come before nodes greater than or equal to x.
 *
 * You should preserve the original relative order of the nodes in each of the two partitions.
 *
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 */


/**
 * Definition for singly-linked list.
 * public class ListNode1 {
 *     int val;
 *     ListNode1 next;
 *     ListNode1(int x) { val = x; }
 * }
 */

class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1(int x) { val = x; }
 }

public class PartitionList86 {
    public ListNode1 partition1(ListNode1 head, int x) {
        if (head == null) {
            return null;
        }
        ListNode1 left = null;
        ListNode1 leftEnd = null;
        ListNode1 right = null;
        ListNode1 rightEnd = null;

        while (head != null) {
            if (head.val < x) {
                if (left == null) {
                    left = new ListNode1(head.val);
                } else if (leftEnd == null) {
                    leftEnd = new ListNode1(head.val);
                    left.next = leftEnd;
                } else {
                    leftEnd.next = new ListNode1(head.val);
                    leftEnd = leftEnd.next;
                }
            } else {
                if (right == null) {
                    right = new ListNode1(head.val);
                } else if (rightEnd == null) {
                    rightEnd = new ListNode1(head.val);
                    right.next = rightEnd;
                } else {
                    rightEnd.next = new ListNode1(head.val);
                    rightEnd = rightEnd.next;
                }
            }
            head = head.next;
        }

        if (leftEnd != null){
            leftEnd.next = right;
            return left;
        } else if (left != null) {
            left.next = right;
            return left;
        } else {
            return right;
        }

    }


    /**
     * https://discuss.leetcode.com/topic/23951/java-solution-pick-out-larger-nodes-and-append-to-the-end
     */
    public ListNode1 partition2(ListNode1 head, int x) {
        if(head==null || head.next==null) return head;

        ListNode1 l1 = new ListNode1(0);
        ListNode1 l2 = new ListNode1(0);
        ListNode1 p1=l1, p2=l2;

        p1.next = head;
        while(p1.next!=null) {
            // keep moving larger node to list 2;

            if(p1.next.val>=x) {
                ListNode1 tmp = p1.next;
                p1.next = tmp.next;

                p2.next = tmp;
                p2 = p2.next;
            }
            else {
                p1 = p1.next;
            }
        }

        // conbine lists 1 and 2;
        p2.next = null;
        p1.next = l2.next;
        return l1.next;
    }


}
