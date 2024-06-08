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
//124_Binary_Tree_Maximum_Path_Sum.java

public class Binary_Tree_Maximum_Path_Sum {
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] result = new int[] { root.val };
        maxPathHelper(root, result);
        return result[0];
    }

    private int maxPathHelper(TreeNode root, int[] result) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, maxPathHelper(root.left, result));
        int right = Math.max(0, maxPathHelper(root.right, result));

        int currMax = root.val + left + right;
        result[0] = Math.max(result[0], currMax);

        return root.val + Math.max(left, right);
    }
    public static void main(String[] args) {

    }
}
