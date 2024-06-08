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
//122_Best_Time_to_Buy_and_Sell_Stock_II.java

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int idx = 0, buy = prices[idx], sell = prices[idx], profit = 0;
        int N = prices.length - 1;

        while (idx < N) {
            while (idx < N && prices[idx + 1] <= prices[idx]) {
                idx++;
            }

            buy = prices[idx];

            while (idx < N && prices[idx + 1] > prices[idx]) {
                idx++;
            }

            sell = prices[idx];

            profit += sell - buy;
        }

        return profit;
    }
    public static void main(String[] args) {

    }
}
