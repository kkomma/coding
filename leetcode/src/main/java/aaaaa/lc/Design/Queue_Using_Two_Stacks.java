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
//232_Queue_Using_Two_Stacks.java

public class Queue_Using_Two_Stacks {
    private Stack<Integer> push, pop;

    /** Initialize your data structure here. */
    public Queue_Using_Two_Stacks() {
        push = new Stack<>();
        pop = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        push.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (pop.isEmpty()) {
            while (!push.isEmpty()) {
                pop.push(push.pop());
            }
        }

        return pop.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (pop.isEmpty()) {
            while (!push.isEmpty()) {
                pop.push(push.pop());
            }
        }

        return pop.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return push.isEmpty() && pop.isEmpty();
    }
    public static void main(String[] args) {

    }
}
