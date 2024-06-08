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
//121_Best_Time_to_Buy_and_Sell_Stock.java

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            System.err.println("Error: Empty prices array!"+prices);
            return 0;
        }

        int minPrices = prices[0], profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrices) {
                minPrices = prices[i];
            }

            profit = Math.max(profit, prices[i] - minPrices);
        }

        return profit;
    }
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock solution = new Best_Time_to_Buy_and_Sell_Stock();
    
        int[] prices11 = null;
        int maxProfit11 = solution.maxProfit(prices11);
        System.out.println("Max Profit (Test Case 1): " + maxProfit11);


        // Test case 1: Empty prices array
        int[] prices1 = {};
        int maxProfit1 = solution.maxProfit(prices1);
        System.out.println("Max Profit (Test Case 1): " + maxProfit1);
    
        // Test case 2: Increasing prices
        int[] prices2 = {1, 2, 3, 4, 5};
        int maxProfit2 = solution.maxProfit(prices2);
        System.out.println("Max Profit (Test Case 2): " + maxProfit2);
    
        // Test case 3: Decreasing prices
        int[] prices3 = {5, 4, 3, 2, 1};
        int maxProfit3 = solution.maxProfit(prices3);
        System.out.println("Max Profit (Test Case 3): " + maxProfit3);
    
        // Test case 4: Random prices
        int[] prices4 = {7, 1, 5, 3, 6, 4};
        int maxProfit4 = solution.maxProfit(prices4);
        System.out.println("Max Profit (Test Case 4): " + maxProfit4);
    }


}
