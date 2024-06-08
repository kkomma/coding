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
//567_Permutation_in_String.java

public class Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2.length() < s1.length()) {
            return false;
        }

        int[] lookup = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            lookup[s1.charAt(i) - 'a']++;
        }

        int start = 0, end = s1.length() - 1;

        while (end < s2.length()) {
            for (int i = start; i <= end; i++) {
                lookup[s2.charAt(i) - 'a']--;
            }

            if (allZeros(lookup)) {
                return true;
            }

            for (int i = start; i <= end; i++) {
                lookup[s2.charAt(i) - 'a']++;
            }

            start++;
            end++;
        }

        return false;
    }

    private boolean allZeros(int[] lookup) {
        for (int i = 0; i < lookup.length; i++) {
            if (lookup[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
