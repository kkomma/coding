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
//437_Path_Sum_III.java

public class Path_Sum_III {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return traverseSubtree(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int traverseSubtree(TreeNode root, int sum) {
        int result = 0;
        if (root == null) {
            return result;
        }

        if (root.val == sum) {
            ++result;
        }

        return result + traverseSubtree(root.left, sum - root.val) + traverseSubtree(root.right, sum - root.val);
    }
    public static void main(String[] args) {

    }
}
