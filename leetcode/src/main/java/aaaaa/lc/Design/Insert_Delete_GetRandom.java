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
//380_Insert_Delete_GetRandom_O(1).java

public class Insert_Delete_GetRandom {
    HashMap<Integer, Integer> hm;
    ArrayList<Integer> keys;
    Random generator;

    /** Initialize your data structure here. */
    public Insert_Delete_GetRandom() {
        hm = new HashMap<Integer, Integer>();
        keys = new ArrayList<Integer>();
        generator = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain
     * the specified element.
     */
    public boolean insert(int val) {
        if (hm.containsKey(val)) {
            return false;
        }

        hm.put(val, keys.size());
        keys.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified
     * element.
     */
    public boolean remove(int val) {
        if (!hm.containsKey(val)) {
            return false;
        }

        int removeIdx = hm.get(val);

        if (removeIdx < keys.size() - 1) {
            int lastVal = keys.get(keys.size() - 1);
            keys.set(removeIdx, lastVal);
            hm.put(lastVal, removeIdx);
        }

        keys.remove(keys.size() - 1);
        hm.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return keys.get(generator.nextInt(hm.size()));
    }
    public static void main(String[] args) {

    }
}
