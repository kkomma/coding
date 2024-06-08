package aaaaa.lc.TopKElements;

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
//451_Sort_Characters_By_Frequency.java

public class Sort_Characters_By_Frequency {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        pq.addAll(hm.entrySet());

        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();

            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Sort_Characters_By_Frequency obj = new Sort_Characters_By_Frequency();
    
        // Test Case 1: Empty string
        String s1 = "";
        String expected1 = "";
        String result1 = obj.frequencySort(s1);
        System.out.println(result1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");
    
        // Test Case 2: String with single character
        String s2 = "a";
        String expected2 = "a";
        String result2 = obj.frequencySort(s2);
        System.out.println(result2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");
    
        // Test Case 3: String with multiple characters, no repeated characters
        String s3 = "abcde";
        String expected3 = "abcde";
        String result3 = obj.frequencySort(s3);
        System.out.println(result3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");
    
        // Test Case 4: String with multiple characters, some repeated characters
        String s4 = "abccba";
        String expected4 = "ccbbaa";
        String result4 = obj.frequencySort(s4);
        System.out.println(result4.equals(expected4) ? "Test Case 4 Passed" : "Test Case 4 Failed");
    }
}
