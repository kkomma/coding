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
//136_Single_Number.java

public class Single_Number {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (Integer n : nums) {
            unique ^= n;
        }
        return unique;
    }
    public static void main(String[] args) {

    }
}
