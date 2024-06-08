package aaaaa.lc.Design;

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
//155_Min_Stack.java

public class Min_Stack {
    private int minVal;
    private Stack<Integer> s;

    /** initialize your data structure here. */
    public Min_Stack() {
        minVal = Integer.MAX_VALUE;
        s = new Stack<>();
    }

    public void push(int x) {
        if (x <= minVal) {
            s.push(minVal);
            minVal = x;
        }

        s.push(x);
    }

    public void pop() {
        int topOfStack = s.pop();
        if (minVal == topOfStack) {
            minVal = s.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return minVal;
    }
    public static void main(String[] args) {

    }
}
