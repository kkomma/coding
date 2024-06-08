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
//377_Combination_Sum_IV.java

public class Combination_Sum_IV {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;

        return helper(nums, target, dp);
    }

    private int helper(int[] nums, int remainder, int[] dp) {
        if (remainder < 0) {
            return 0;
        }
        if (remainder == 0) {
            return 1;
        }

        if (dp[remainder] != -1) {
            return dp[remainder];
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += helper(nums, remainder - nums[i], dp);
        }

        dp[remainder] = result;
        return result;
    }
    public static void main(String[] args) {

    }
}
