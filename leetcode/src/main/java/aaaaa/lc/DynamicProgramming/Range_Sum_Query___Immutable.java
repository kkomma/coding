package aaaaa.lc.DynamicProgramming;

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
//303_Range_Sum_Query_-_Immutable.java

public class Range_Sum_Query___Immutable {
    private int[] dp;

    public Range_Sum_Query___Immutable(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        dp = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return dp[j];
        }

        return dp[j] - dp[i - 1];
    }
    public static void main(String[] args) {

//    	["NumArray","sumRange","sumRange","sumRange"]
//    			[[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]
//    					
    					
    }
}
