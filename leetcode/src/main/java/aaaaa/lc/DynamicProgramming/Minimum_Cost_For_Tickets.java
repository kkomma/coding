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
//983_Minimum_Cost_For_Tickets.java

public class Minimum_Cost_For_Tickets {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days[days.length - 1];

        boolean[] travelDay = new boolean[n + 1];
        for (int day : days) {
            travelDay[day] = true;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (!travelDay[i]) {
                dp[i] = dp[i - 1];
                continue;
            }

            int minCost = dp[i - 1] + costs[0];
            minCost = Math.min(minCost, dp[Math.max(0, i - 7)] + costs[1]);
            minCost = Math.min(minCost, dp[Math.max(0, i - 30)] + costs[2]);
            dp[i] = minCost;
        }

        return dp[n];
    }
    public static void main(String[] args) {

    }
}
