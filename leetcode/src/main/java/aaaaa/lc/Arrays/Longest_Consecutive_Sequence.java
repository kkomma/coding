package aaaaa.lc.Arrays;

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
//128_Longest_Consecutive_Sequence.java

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int startingNum : nums) {
            if (!set.contains(startingNum - 1)) {
                int nextVal = startingNum;

                while (set.contains(nextVal)) {
                    ++nextVal;
                }

                max = Math.max(max, nextVal - startingNum);
            }
        }

        return max;
    }
    public static void main(String[] args) {

    }
}
