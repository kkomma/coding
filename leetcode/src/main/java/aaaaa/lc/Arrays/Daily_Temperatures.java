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
//739_Daily_Temperatures.java

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stk = new Stack<>();
        int[] result = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            while (!stk.isEmpty() && T[i] > T[stk.peek()]) {
                int idx = stk.pop();
                result[idx] = i - idx;
            }

            stk.push(i);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
