package aaaaa.lc.TwoPointers;

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
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String ans = "";
        int start = 0, end = 0;
        int counter = map.size(), minLen = Integer.MAX_VALUE;

        while (end < s.length()) {
            Character eCh = s.charAt(end);
            if (map.containsKey(eCh)) {
                map.put(eCh, map.get(eCh) - 1);

                if (map.get(eCh) == 0) {
                    --counter;
                }
            }

            end++;

            while (counter == 0) {
                if (minLen > end - start) {
                    minLen = end - start;
                    ans = s.substring(start, end);
                }

                Character sCh = s.charAt(start);
                if (map.containsKey(sCh)) {
                    map.put(sCh, map.get(sCh) + 1);

                    if (map.get(sCh) > 0) {
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
