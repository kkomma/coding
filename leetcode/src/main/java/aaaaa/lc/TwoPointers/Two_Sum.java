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
//1_Two_Sum.java

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (hm.containsKey(remainder)) {
                indices[0] = hm.get(remainder);
                indices[1] = i;
                return indices;
            }

            hm.put(nums[i], i);
        }

        return new int[] {};
    }
    public static void main(String[] args) {

    }
}
