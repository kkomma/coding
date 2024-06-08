package aaaaa.lc.Matrix;

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
//85_Maximal_Rectangle.java

public class Maximal_Rectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int[] heights = new int[matrix[0].length];
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0') {
                    heights[j] = 0;
                } else {
                    heights[j] += 1;
                }
            }

            int area = largestRectangleArea(heights);
            max = Math.max(max, area);
        }

        return max;
    }

    private int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int h = i == n ? 0 : heights[i];

            while (!s.isEmpty() && heights[s.peek()] > h) {
                int currHeight = heights[s.pop()];
                int leftBoundary = s.isEmpty() ? -1 : s.peek();
                int rightBoundary = i - 1;
                max = Math.max(max, currHeight * (rightBoundary - leftBoundary));
            }

            s.push(i);
        }

        return max;
    }
    public static void main(String[] args) {

    }
}
