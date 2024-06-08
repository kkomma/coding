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
//338_Counting_Bits.java

public class Counting_Bits {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        int offset = 1;

        for (int i = 1; i <= num; i++) {
            if (offset * 2 == i) {
                offset *= 2;
            }

            dp[i] = dp[i - offset] + 1;
        }

        return dp;
    }
    public static void main(String[] args) {

    }
}
