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
//852_Peak_Index_in_a_Mountain_Array.java

public class Peak_Index_in_a_Mountain_Array {
    public int peakIndexInMountainArray(int[] A) {
        int start = 0, end = A.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (A[mid] > A[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    public static void main(String[] args) {

    }
}
