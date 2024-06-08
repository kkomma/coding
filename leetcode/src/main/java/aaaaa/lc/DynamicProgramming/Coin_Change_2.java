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
//518_Coin_Change_2.java

public class Coin_Change_2 {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 1;

            for (int j = 1; j <= amount; j++) {
                int currCoinValue = coins[i - 1];

                int withoutThisCoin = dp[i - 1][j];
                int withThisCoin = j >= currCoinValue ? dp[i][j - currCoinValue] : 0;

                dp[i][j] = withThisCoin + withoutThisCoin;
            }
        }

        return dp[coins.length][amount];
    }
    public static void main(String[] args) {

    }
}
