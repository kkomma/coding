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
//209_Minimum_Size_Subarray_Sum.java

public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE;
        int start = 0, end = 0, sum = 0;

        while (end < nums.length) {
            sum += nums[end++];

            if (sum >= s) {
                while (sum >= s) {
                    result = Math.min(result, end - start);
                    sum -= nums[start++];
                }
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
    public static void main(String[] args) {

    }
}
