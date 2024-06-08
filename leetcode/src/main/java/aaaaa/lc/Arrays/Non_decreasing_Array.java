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
//665_Non-decreasing_Array.java

public class Non_decreasing_Array {
    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int cnt = 0;

        for (int i = 1; i < nums.length && cnt <= 1; i++) {
            if (nums[i] < nums[i - 1]) {
                ++cnt;
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return cnt <= 1;
    }
    public static void main(String[] args) {

    }
}
