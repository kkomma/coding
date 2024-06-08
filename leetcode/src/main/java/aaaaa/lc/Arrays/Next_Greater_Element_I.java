package aaaaa.lc.Arrays;

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
//496_Next_Greater_Element_I.java

public class Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int[] result = new int[nums1.length];

        for (int num : nums2) {
            while (!s.isEmpty() && num > s.peek()) {
                hm.put(s.pop(), num);
            }

            s.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = hm.getOrDefault(nums1[i], -1);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
