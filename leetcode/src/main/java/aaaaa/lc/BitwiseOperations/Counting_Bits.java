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
//338_Counting_Bits.java

public class Counting_Bits {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        
        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0) {
                result[i] = result[i >> 1];
            } else {
                result[i] = result[i - 1] + 1;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {

    }
}
