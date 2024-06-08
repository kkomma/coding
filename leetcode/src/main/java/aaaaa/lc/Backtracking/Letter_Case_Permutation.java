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
//784_Letter_Case_Permutation.java

public class Letter_Case_Permutation {
    public List<String> letterCasePermutation(String S) {
        if (S == null || S.length() == 0) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        dfs(S.toCharArray(), 0, result);
        return result;
    }

    private void dfs(char[] word, int idx, List<String> result) {
        if (idx == word.length) {
            result.add(new String(word));
            return;
        }

        if (Character.isDigit(word[idx])) {
            dfs(word, idx + 1, result);
            return;
        }

        word[idx] = Character.toLowerCase(word[idx]);
        dfs(word, idx + 1, result);

        word[idx] = Character.toUpperCase(word[idx]);
        dfs(word, idx + 1, result);
    }
    public static void main(String[] args) {

    }
}
