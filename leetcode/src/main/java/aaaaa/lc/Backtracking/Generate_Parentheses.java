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
//22_Generate_Parentheses.java

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        dfs(n, 0, 0, new StringBuilder(), result);
        return result;
    }

    private void dfs(int n, int open, int close, StringBuilder sb, List<String> result) {
        if (open == n && close == n) {
            result.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append('(');
            dfs(n, open + 1, close, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append(')');
            dfs(n, open, close + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public static void main(String[] args) {

    }
}
