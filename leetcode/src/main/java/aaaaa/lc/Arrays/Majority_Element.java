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
//169_Majority_Element.java

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            if (hm.get(nums[i]) > n / 2) {
                result = nums[i];
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
