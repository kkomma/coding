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
//76_Minimum_Window_Substring.java

public class Minimum_Window_Substring {
    public String minWindow(String s, String t) {
        if (t == null || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> hm = new HashMap<>();

        for (Character c : t.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0, minLen = Integer.MAX_VALUE, counter = hm.size();
        String ans = "";

        while (end < s.length()) {
            char eCh = s.charAt(end);

            if (hm.containsKey(eCh)) {
                int cnt = hm.get(eCh);
                hm.put(eCh, --cnt);

                if (cnt == 0) {
                    --counter;
                }
            }

            end++;

            while (counter == 0) {
                if (minLen > end - start) {
                    minLen = end - start;
                    ans = s.substring(start, end);
                }

                char sCh = s.charAt(start);

                if (hm.containsKey(sCh)) {
                    int cnt = hm.get(sCh);
                    hm.put(sCh, ++cnt);

                    if (cnt > 0) {
                        ++counter;
                    }
                }

                start++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

    }
}
