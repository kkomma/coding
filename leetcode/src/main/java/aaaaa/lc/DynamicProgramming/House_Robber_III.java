package aaaaa.lc.DynamicProgramming;

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
//337_House_Robber_III.java

public class House_Robber_III {
    public int rob(TreeNode root) {
        return helper(root, new HashMap<TreeNode, Integer>());
    }

    private int helper(TreeNode root, Map<TreeNode, Integer> m) {
        if (root == null) {
            return 0;
        }
        if (m.containsKey(root)) {
            return m.get(root);
        }

        int result = 0;

        if (root.left != null) {
            result += helper(root.left.left, m) + helper(root.left.right, m);
        }

        if (root.right != null) {
            result += helper(root.right.left, m) + helper(root.right.right, m);
        }

        result = Math.max(result + root.val, helper(root.left, m) + helper(root.right, m));
        m.put(root, result);
        return result;
    }
    public static void main(String[] args) {

    }
}
