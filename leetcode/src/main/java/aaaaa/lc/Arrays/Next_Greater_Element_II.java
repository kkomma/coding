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
//503_Next_Greater_Element_II.java

public class Next_Greater_Element_II {
    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }

        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            s.push(i);
        }

        for (int i = n - 1; i >= 0; i--) {
            result[i] = -1;

            while (!s.isEmpty() && nums[i] >= nums[s.peek()]) {
                s.pop();
            }

            if (!s.isEmpty()) {
                result[i] = nums[s.peek()];
            }

            s.push(i);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
