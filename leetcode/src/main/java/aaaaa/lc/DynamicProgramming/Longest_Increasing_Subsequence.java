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
//300_Longest_Increasing_Subsequence.java

public class Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;

        for (int currNum = 0; currNum < nums.length; currNum++) {
            for (int prevNum = 0; prevNum < currNum; prevNum++) {
                if (nums[currNum] > nums[prevNum]) {
                    dp[currNum] = Math.max(dp[currNum], dp[prevNum] + 1);
                }
            }
            max = Math.max(max, dp[currNum]);
        }

        return max;
    }
    public static void main(String[] args) {

    }
}
