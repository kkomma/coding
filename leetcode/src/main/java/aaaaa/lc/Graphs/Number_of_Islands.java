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
//200_Number_of_Islands.java

public class Number_of_Islands {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    ++count;
                    clearIsland(grid, i, j);
                }
            }
        }

        return count;
    }

    private void clearIsland(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] == '0') {
            return;
        }

        grid[x][y] = '0';

        clearIsland(grid, x + 1, y);
        clearIsland(grid, x - 1, y);
        clearIsland(grid, x, y - 1);
        clearIsland(grid, x, y + 1);
    }
    public static void main(String[] args) {

    }
}
