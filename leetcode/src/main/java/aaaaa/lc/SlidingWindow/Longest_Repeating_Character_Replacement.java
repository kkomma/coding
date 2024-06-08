package aaaaa.lc.SlidingWindow;

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
//424_Longest_Repeating_Character_Replacement.java

public class Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int start = 0, end = 0, maxLen = Integer.MIN_VALUE, maxSize = Integer.MIN_VALUE;
        char[] lookup = new char[26];

        while (end < s.length()) {
            lookup[s.charAt(end) - 'A']++;
            maxLen = Math.max(maxLen, lookup[s.charAt(end) - 'A']);
            end++;

            if (end - start - maxLen > k) {
                lookup[s.charAt(start) - 'A']--;
                start++;
            }

            maxSize = Math.max(maxSize, end - start);
        }

        return maxSize;
    }
    public static void main(String[] args) {

    }
}
