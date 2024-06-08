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
//630_Course_Schedule_III.java

public class Course_Schedule_III {
    public int scheduleCourse(int[][] courses) {
        int n = courses.length;
        if (n == 0)
            return 0;
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int start = 0;
        for (int[] course : courses) {
            start += course[0];
            pq.offer(course[0]);
            if (start > course[1]) {
                start -= pq.poll();
            }
        }
        return pq.size();
    }
    public static void main(String[] args) {

    }
}
