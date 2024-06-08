package aaaaa.lc.TwoPointers;

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
//11_Container_With_Most_Water.java

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int start = 0, end = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (start < end) {
            maxArea = Math.max(maxArea, Math.min(height[start], height[end]) * (end - start));

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {

    }
}
