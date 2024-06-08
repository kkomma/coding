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
//621_Task_Scheduler.java

public class Task_Scheduler {
    public int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) {
            return 0;
        }

        Map<Character, Integer> hm = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;

        for (char c : tasks) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, hm.get(c));
        }

        int cpuCycles = (maxFreq - 1) * (n + 1);

        for (int value : hm.values()) {
            if (maxFreq == value) {
                ++cpuCycles;
            }
        }

        return Math.max(cpuCycles, tasks.length);
    }
    public static void main(String[] args) {

    }
}
