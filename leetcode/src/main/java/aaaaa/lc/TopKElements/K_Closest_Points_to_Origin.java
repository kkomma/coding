package aaaaa.lc.TopKElements;

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
//973_K_Closest_Points_to_Origin.java

public class K_Closest_Points_to_Origin {
    public int[][] kClosest(int[][] points, int K) {
        if (points == null || points.length == 0) {
            return points;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int i = 0; i < points.length; i++) {
            int distance = (Math.abs(points[i][0]) * Math.abs(points[i][0]))
                    + (Math.abs(points[i][1]) * Math.abs(points[i][1]));
            pq.offer(new int[] { i, distance });
        }

        ArrayList<int[]> result = new ArrayList<>();
        while (K > 0) {
            result.add(points[pq.poll()[0]]);
            --K;
        }

        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {

    }
}
