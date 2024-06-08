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
//350_Intersection_of_Two_Arrays_II.java

public class Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            int freq = hm.getOrDefault(nums2[i], 0);
            if (freq > 0) {
                intersection.add(nums2[i]);
                hm.put(nums2[i], --freq);
            }
        }

        int[] result = new int[intersection.size()];
        int idx = 0;
        for (int commonVal : intersection) {
            result[idx++] = commonVal;
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
