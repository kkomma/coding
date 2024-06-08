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
//435_Non-overlapping_Intervals.java

public class Non_overlapping_Intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

        int result = 0;
        int[] prevInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (prevInterval[1] <= intervals[i][0]) {
                prevInterval = intervals[i];
                continue;
            }

            ++result;
            if (intervals[i][1] < prevInterval[1]) {
                prevInterval = intervals[i];
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
