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
//543_Diameter_of_Binary_Tree.java

public class Diameter_of_Binary_Tree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] longestDiameter = new int[1];
        calculateDepth(root, longestDiameter);
        return longestDiameter[0];
    }

    private int calculateDepth(TreeNode root, int[] longestDiameter) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateDepth(root.left, longestDiameter);
        int rightHeight = calculateDepth(root.right, longestDiameter);

        longestDiameter[0] = Math.max(longestDiameter[0], leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {

    }
}
