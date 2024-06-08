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
//378_Kth_Smallest_Element_in_a_Sorted_Matrix.java

public class Kth_Smallest_Element_in_a_Sorted_Matrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (int i = 0; i < matrix.length; i++) {
            Element e = new Element(matrix[0][i], 0, i);
            pq.offer(e);
        }

        for (int i = 0; i < k - 1; i++) {
            Element e = pq.poll();

            if (e.row == matrix.length - 1) {
                continue;
            }

            e.row = e.row + 1;
            e.val = matrix[e.row][e.col];
            pq.offer(e);
        }

        return pq.poll().val;
    }

    class Element {
        int val;
        int row;
        int col;

        public Element(int v, int r, int c) {
            val = v;
            row = r;
            col = c;
        }
    }
    public static void main(String[] args) {

    }
}
