package aaaaa.lc.SlidingWindow;

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
//239_Sliding_Window_Maximum.java

public class Sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }

        int[] result = new int[nums.length - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            // Remove entries outside of the current window
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.pollFirst();
            }

            // Remove entries that are smaller than the current indexes value
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            // Only begin adding the highest values when our sliding window
            // is greater than or equal to k elements
            //
            // This allows us to sample the max of the first k elements
            // before deciding if we should add it to the result
            if (i >= k - 1) {
                result[idx++] = nums[dq.peek()];
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
