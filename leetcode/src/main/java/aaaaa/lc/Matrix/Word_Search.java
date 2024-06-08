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
//79_Word_Search.java

public class Word_Search {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) {
            return false;
        }

        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] wordArr = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (wordArr[0] == board[i][j] && dfs(board, i, j, wordArr, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int x, int y, char[] word, int currIdx, boolean[][] visited) {
        if (currIdx == word.length) {
            return true;
        }

        if (x < 0 || y < 0 || x >= board.length || y >= board[x].length || board[x][y] != word[currIdx]
                || visited[x][y]) {
            return false;
        }

        visited[x][y] = true;

        if (dfs(board, x - 1, y, word, currIdx + 1, visited) || dfs(board, x + 1, y, word, currIdx + 1, visited)
                || dfs(board, x, y - 1, word, currIdx + 1, visited)
                || dfs(board, x, y + 1, word, currIdx + 1, visited)) {
            return true;
        }

        visited[x][y] = false;
        return false;
    }
    public static void main(String[] args) {

    }
}
