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
//538_Convert_BST_to_Greater_Tree.java

public class Convert_BST_to_Greater_Tree {
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    private int dfs(TreeNode root, int value) {
        if (root == null) {
            return value;
        }

        int right = dfs(root.right, value);
        root.val += right;
        int left = dfs(root.left, root.val);
        return left;
    }
    public static void main(String[] args) {

    }
}
