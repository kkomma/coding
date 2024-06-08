package aaaaa.lc.Backtracking;

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
//51_N-Queens.java

public class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        if (n == 0) {
            return Collections.emptyList();
        }

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> result = new ArrayList<>();
        dfs(board, 0, result);
        return result;
    }

    private List<String> constructBoard(char[][] board) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            result.add(row);
        }

        return result;
    }

    private boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'Q' && (row == i || row + j == col + i || row + col == i + j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private void dfs(char[][] board, int colIdx, List<List<String>> result) {
        if (colIdx == board.length) {
            result.add(constructBoard(board));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isValid(board, i, colIdx)) {
                board[i][colIdx] = 'Q';
                dfs(board, colIdx + 1, result);
                board[i][colIdx] = '.';
            }
        }
    }
    public static void main(String[] args) {

    }
}
