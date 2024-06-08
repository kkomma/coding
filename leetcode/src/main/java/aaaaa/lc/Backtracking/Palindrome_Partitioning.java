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
//131_Palindrome_Partitioning.java

public class Palindrome_Partitioning {
    public List<List<String>> partition(String s) {
        if (s == null || s.length() == 0) {
            return Collections.emptyList();
        }

        List<List<String>> result = new ArrayList<>();
        dfs(0, s, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int idx, String s, List<String> tempResult, List<List<String>> result) {
        if (idx == s.length()) {
            result.add(new ArrayList<>(tempResult));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                tempResult.add(s.substring(idx, i + 1));
                dfs(i + 1, s, tempResult, result);
                tempResult.remove(tempResult.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String... args) {
    	Palindrome_Partitioning pp = new Palindrome_Partitioning();
    	System.out.println(pp.partition("aab"));
    }
}
