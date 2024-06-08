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
//658_Find_K_Closest_Elements.java

public class Find_K_Closest_Elements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0, end = arr.length - 1 - k;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (Math.abs(x - arr[mid]) > Math.abs(x - arr[mid + k])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = start; i < start + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
