package aaaaa.lc.ModifiedBinarySearch;

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
//744_Find_Smallest_Letter_Greater_Than_Target.java

public class Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target + 1 < letters[0] || target + 1 > letters[letters.length - 1]) {
            return letters[0];
        }

        int start = 0, end = letters.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] == target + 1) {
                return letters[mid];
            } else if (letters[mid] < target + 1) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return letters[end];
    }
    public static void main(String[] args) {

    }
}
