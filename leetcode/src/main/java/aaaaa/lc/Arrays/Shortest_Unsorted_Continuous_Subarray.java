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
//581_Shortest_Unsorted_Continuous_Subarray.java

public class Shortest_Unsorted_Continuous_Subarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] temp = nums.clone();
        Arrays.sort(temp);

        int start = 0, end = nums.length - 1;

        while (start < nums.length && nums[start] == temp[start]) {
            start++;
        }
        while (end > start && nums[end] == temp[end]) {
            end--;
        }

        return end - start + 1;
    }
    public static void main(String[] args) {

    }
}
