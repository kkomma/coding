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
//64_Minimum_Path_Sum.java

public class Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        int height = grid.length, width = grid[0].length;
        int[][] memo = new int[height][width];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return helper(grid, 0, 0, memo);
    }

    private int helper(int[][] grid, int row, int col, int[][] memo) {
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return grid[row][col];
        }

        if (memo[row][col] != -1) {
            return memo[row][col];
        }

        if (row == grid.length - 1) {
            return grid[row][col] + helper(grid, row, col + 1, memo);
        }
        if (col == grid[0].length - 1) {
            return grid[row][col] + helper(grid, row + 1, col, memo);
        }

        int result = grid[row][col] + Math.min(helper(grid, row + 1, col, memo), helper(grid, row, col + 1, memo));
        memo[row][col] = result;
        return result;
    }
    public static void main(String[] args) {

    }
}
