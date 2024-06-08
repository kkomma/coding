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
//198_House_Robber.java

public class House_Robber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currHouse = 0, oneHouseAgo = 0, twoHousesAgo = 0;

        for (int i = 0; i < nums.length; i++) {
            currHouse = Math.max(twoHousesAgo + nums[i], oneHouseAgo);
            twoHousesAgo = oneHouseAgo;
            oneHouseAgo = currHouse;
        }

        return currHouse;
    }
    public static void main(String[] args) {

    }
}
