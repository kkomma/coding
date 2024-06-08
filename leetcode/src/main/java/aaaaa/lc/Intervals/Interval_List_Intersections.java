package aaaaa.lc.Intervals;

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
//986_Interval_List_Intersections.java

public class Interval_List_Intersections {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if (A == null || A.length == 0 || B == null || B.length == 0) {
            return new int[][] {};
        }

        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            int startMax = Math.max(A[i][0], B[j][0]);
            int endMin = Math.min(A[i][1], B[j][1]);

            if (startMax <= endMin) {
                result.add(new int[] { startMax, endMin });
            }

            if (A[i][1] == endMin) {
                ++i;
            } else {
                ++j;
            }
        }

        return result.toArray(new int[result.size()][2]);
    }
    public static void main(String[] args) {

    }
}
