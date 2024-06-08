package aaaaa.lc.TreeDepthFirstSearch;

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
//129_Sum_Root_to_Leaf_Numbers.java

public class Sum_Root_to_Leaf_Numbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int levelBase) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return levelBase + root.val;
        }

        int nextLevelBase = 10 * (levelBase + root.val);
        int left = dfs(root.left, nextLevelBase);
        int right = dfs(root.right, nextLevelBase);

        return left + right;
    }
    public static void main(String[] args) {

    }
}
