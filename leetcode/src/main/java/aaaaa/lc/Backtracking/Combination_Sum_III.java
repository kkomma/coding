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
//216_Combination_Sum_III.java

public class Combination_Sum_III {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int k, int n, int idx, List<Integer> tempResult, List<List<Integer>> result) {
        if (tempResult.size() == k && n == 0) {
            result.add(new ArrayList<>(tempResult));
            return;
        }

        for (int i = idx; i <= 9; i++) {
            tempResult.add(i);
            dfs(k, n - i, i + 1, tempResult, result);
            tempResult.remove(tempResult.size() - 1);
        }
    }
    public static void main(String[] args) {

    }
}
