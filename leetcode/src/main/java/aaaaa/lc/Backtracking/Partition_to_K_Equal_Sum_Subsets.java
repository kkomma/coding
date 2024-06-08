package aaaaa.lc.Backtracking;

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
//698_Partition_to_K_Equal_Sum_Subsets.java

public class Partition_to_K_Equal_Sum_Subsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % k != 0) {
            return false;
        }

        int target = totalSum / k;
        return helper(nums, k, 0, 0, target, new boolean[nums.length]);
    }

    private boolean helper(int[] nums, int k, int start, int currSum, int target, boolean[] used) {
        if (k == 1) {
            return true;
        }
        if (currSum == target) {
            return helper(nums, k - 1, 0, 0, target, used);
        }

        for (int i = start; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            if (helper(nums, k, i + 1, currSum + nums[i], target, used)) {
                return true;
            }
            used[i] = false;
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
