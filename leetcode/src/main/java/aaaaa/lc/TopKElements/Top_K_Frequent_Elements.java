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
//347_Top_K_Frequent_Elements.java

public class Top_K_Frequent_Elements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        Map<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.add(entry);
        }

        while (k > 0) {
            result.add(pq.poll().getKey());
            k--;
        }

        return result;
    }
    public static void main(String[] args) {
        Top_K_Frequent_Elements solution = new Top_K_Frequent_Elements();
    
        // Test case 1: Basic input
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        List<Integer> result1 = solution.topKFrequent(nums1, k1);
        System.out.println("Test case 1: " + result1); // Expected output: [1, 2]
    
        // Test case 2: Empty input
        int[] nums2 = {};
        int k2 = 3;
        List<Integer> result2 = solution.topKFrequent(nums2, k2);
        System.out.println("Test case 2: " + result2); // Expected output: []
    
        // Test case 3: Input with negative numbers
        int[] nums3 = {-1, -1, 0, 1, 1, 2};
        int k3 = 2;
        List<Integer> result3 = solution.topKFrequent(nums3, k3);
        System.out.println("Test case 3: " + result3); // Expected output: [-1, 1]
    
        // Test case 4: Input with duplicate numbers
        int[] nums4 = {3, 1, 1, 2, 2, 2, 3, 3, 3};
        int k4 = 3;
        List<Integer> result4 = solution.topKFrequent(nums4, k4);
        System.out.println("Test case 4: " + result4); // Expected output: [3, 2, 1]
    }
    
}
