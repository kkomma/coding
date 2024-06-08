package aaaaa.lc.SlidingWindow;

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
//995_Minimum_Number_of_K_Consecutive_Bit_Flips.java

public class Minimum_Number_of_K_Consecutive_Bit_Flips {
    public int minKBitFlips(int[] A, int K) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int result = 0, lastFlipIdx = A.length - K;

        for (int i = 0; i <= lastFlipIdx; i++) {
            if (A[i] == 1) {
                continue;
            }
            ++result;

            for (int j = 0; j < K; j++) {
                A[i + j] ^= 1;
            }
        }

        for (int i = lastFlipIdx + 1; i < A.length; i++) {
            if (A[i] == 0) {
                return -1;
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
