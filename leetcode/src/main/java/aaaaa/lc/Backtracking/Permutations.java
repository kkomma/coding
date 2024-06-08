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
//46_Permutations.java

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[] nums, List<Integer> tempResult, List<List<Integer>> result) {
        if (tempResult.size() == nums.length) {
            result.add(new ArrayList<>(tempResult));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempResult.contains(nums[i])) {
                continue;
            }
            tempResult.add(nums[i]);
            dfs(nums, tempResult, result);
            tempResult.remove(tempResult.size() - 1);
        }
    }
    public static void main(String[] args) {

    }
}
