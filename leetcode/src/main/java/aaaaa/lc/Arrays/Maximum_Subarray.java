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
//53_Maximum_Subarray.java

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0], rollingMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (rollingMax < 0) {
                rollingMax = 0;
            }
            rollingMax += nums[i];
            max = Math.max(max, rollingMax);
        }

        return max;
    }
    public static void main(String[] args) {

    }
}
