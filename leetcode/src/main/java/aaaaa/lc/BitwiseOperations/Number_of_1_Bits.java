package aaaaa.lc.BitwiseOperations;

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
//191_Number_of_1_Bits.java

public class Number_of_1_Bits {
    public int hammingWeight(int n) {
        int total = 0;

        for (int i = 0; i < 32; i++) {
            total += (n & 1);
            n = n >> 1;
        }

        return total;
    }
    public static void main(String[] args) {

    }
}
