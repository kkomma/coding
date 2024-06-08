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
//895_Maximum_Frequency_Stack.java

public class Maximum_Frequency_Stack {
    private List<Stack<Integer>> sList;
    private Map<Integer, Integer> m;

    public Maximum_Frequency_Stack() {
        sList = new ArrayList<>();
        m = new HashMap<>();
    }

    public void push(int x) {
        m.put(x, m.getOrDefault(x, 0) + 1);

        if (sList.size() < m.get(x)) {
            sList.add(new Stack<>());
        }
        sList.get(m.get(x) - 1).push(x);
    }

    public int pop() {
        int result = sList.get(sList.size() - 1).pop();
        m.put(result, m.get(result) - 1);

        if (sList.get(sList.size() - 1).isEmpty()) {
            sList.remove(sList.size() - 1);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
