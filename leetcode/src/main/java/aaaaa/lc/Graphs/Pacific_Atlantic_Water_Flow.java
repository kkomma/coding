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
//417_Pacific_Atlantic_Water_Flow.java

public class Pacific_Atlantic_Water_Flow {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;

        boolean[][] pacificVisited = new boolean[rows][cols];
        boolean[][] atlanticVisited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            dfs(matrix, i, 0, -1, pacificVisited);
            dfs(matrix, i, cols - 1, -1, atlanticVisited);
        }

        for (int j = 0; j < cols; j++) {
            dfs(matrix, 0, j, -1, pacificVisited);
            dfs(matrix, rows - 1, j, -1, atlanticVisited);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacificVisited[i][j] && atlanticVisited[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    private void dfs(int[][] matrix, int x, int y, int prevWaterHeight, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[x].length || visited[x][y]
                || prevWaterHeight > matrix[x][y]) {
            return;
        }

        int height = matrix[x][y];
        visited[x][y] = true;

        dfs(matrix, x - 1, y, height, visited);
        dfs(matrix, x + 1, y, height, visited);
        dfs(matrix, x, y - 1, height, visited);
        dfs(matrix, x, y + 1, height, visited);

        return;
    }
    public static void main(String[] args) {

    }
}
