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
//39_Combination_Sum.java

public class Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[] candidates, int target, int idx, List<Integer> tempResult, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(tempResult));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            tempResult.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, tempResult, result);
            tempResult.remove(tempResult.size() - 1);
        }
    }
    public static void main(String[] args) {

    }
}
