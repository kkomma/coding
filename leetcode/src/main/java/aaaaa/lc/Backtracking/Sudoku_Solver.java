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
//37_Sudoku_Solver.java

public class Sudoku_Solver {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        solve(board);
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        int blockRow = (row / 3) * 3, blockCol = (col / 3) * 3;

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num || board[row][i] == num || board[blockRow + i / 3][blockCol + i % 3] == num) {
                return false;
            }
        }

        return true;
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
