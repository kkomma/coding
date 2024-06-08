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
//41_First_Missing_Positive.java

public class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0 || nums[i] > len) {
                nums[i] = len + 1;
            }

            System.out.println(nums[i]);
        }

        for (int i = 0; i < len; i++) {
            int idx = Math.abs(nums[i]);

            if (idx > len) {
                continue;
            }

            --idx;

            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }

        return len + 1;
    }
    public static void main(String[] args) {

    }
}
