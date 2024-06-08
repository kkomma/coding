package aaaaa.lc.Graphs;

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
//329_Longest_Increasing_Path_in_a_Matrix.java

public class Longest_Increasing_Path_in_a_Matrix {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int m = matrix.length, n = matrix[0].length, result = 1;
        int[][] memo = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result = Math.max(result, dfs(matrix, i, j, Integer.MIN_VALUE, memo));
            }
        }

        return result;
    }

    private int dfs(int[][] matrix, int row, int col, int prevVal, int[][] memo) {
        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[row].length || matrix[row][col] <= prevVal) {
            return 0;
        }

        if (memo[row][col] != 0) {
            return memo[row][col];
        }

        int currVal = matrix[row][col], tempMax = 0;

        tempMax = Math.max(tempMax, dfs(matrix, row - 1, col, currVal, memo));
        tempMax = Math.max(tempMax, dfs(matrix, row + 1, col, currVal, memo));
        tempMax = Math.max(tempMax, dfs(matrix, row, col - 1, currVal, memo));
        tempMax = Math.max(tempMax, dfs(matrix, row, col + 1, currVal, memo));

        memo[row][col] = ++tempMax;
        return tempMax;
    }
    public static void main(String[] args) {

    }
}
