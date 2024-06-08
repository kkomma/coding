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
//32_Longest_Valid_Parentheses.java

public class Longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] dp = new int[s.length()];
        dp[0] = 0;
        int leftBracketCount = 0, result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ++leftBracketCount;
            } else if (leftBracketCount > 0) {
                dp[i] = dp[i - 1] + 2;

                if (i - dp[i] > 0) {
                    dp[i] += dp[i - dp[i]];
                }

                --leftBracketCount;
                result = Math.max(result, dp[i]);
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
