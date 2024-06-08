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
//113_Path_Sum_II.java

public class Path_Sum_II {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        traverseTree(root, sum, new ArrayList<>(), result);
        return result;
    }

    private void traverseTree(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> result) {
        temp.add(root.val);

        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new ArrayList<>(temp));
        }

        if (root.left != null) {
            traverseTree(root.left, sum - root.val, temp, result);
        }

        if (root.right != null) {
            traverseTree(root.right, sum - root.val, temp, result);
        }

        temp.remove(temp.size() - 1);
    }
    public static void main(String[] args) {

    }
}
