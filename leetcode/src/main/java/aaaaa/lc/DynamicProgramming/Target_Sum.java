package aaaaa.lc.DynamicProgramming;

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
//494_Target_Sum.java

public class Target_Sum {
    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        return dfs(nums, S, 0, 0, new HashMap<>());
    }

    private int dfs(int[] nums, int S, int sum, int idx, Map<String, Integer> m) {
        String encodedVal = idx + "->" + sum;
        if (m.containsKey(encodedVal)) {
            return m.get(encodedVal);
        }

        if (idx == nums.length) {
            if (sum == S) {
                return 1;
            }
            return 0;
        }

        int add = dfs(nums, S, sum + nums[idx], idx + 1, m);
        int minus = dfs(nums, S, sum - nums[idx], idx + 1, m);

        m.put(encodedVal, add + minus);
        return add + minus;
    }
    public static void main(String[] args) {

    }
}
