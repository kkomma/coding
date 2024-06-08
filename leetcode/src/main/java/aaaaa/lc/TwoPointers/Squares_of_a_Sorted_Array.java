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
//977_Squares_of_a_Sorted_Array.java

public class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }

        int[] result = new int[nums.length];
        int start = 0, end = result.length - 1, idx = end;

        while (start <= end) {
            if (Math.abs(nums[start]) < Math.abs(nums[end])) {
                result[idx] = nums[end] * nums[end];
                end--;
            } else {
                result[idx] = nums[start] * nums[start];
                start++;
            }

            idx--;
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
