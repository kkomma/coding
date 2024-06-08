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
//140_Word_Break_II.java

public class Word_Break_II {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return backtrack(s, wordDict, new HashMap<String, List<String>>());
    }

    private List<String> backtrack(String s, List<String> wordDict, Map<String, List<String>> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<String> result = new ArrayList<>();

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String remainder = s.substring(word.length());

                if (remainder.length() == 0) {
                    result.add(word);
                } else {
                    for (String substring : backtrack(remainder, wordDict, memo)) {
                        result.add(word + " " + substring);
                    }
                }
            }
        }

        memo.put(s, result);
        return result;
    }
    public static void main(String[] args) {

    }
}
