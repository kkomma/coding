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
//105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal.java

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }

        return buildTreeHelper(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int inOrderIdx = preStart;
        for (int i = 0; i < inorder.length; i++) {
            if (root.val == inorder[i]) {
                inOrderIdx = i;
                break;
            }
        }

        int leftTreeLength = inOrderIdx - inStart;

        root.left = buildTreeHelper(preorder, inorder, preStart + 1, inStart, inOrderIdx - 1);
        return root.right = buildTreeHelper(preorder, inorder, preStart + leftTreeLength + 1, inOrderIdx + 1, inEnd);
    }
    public static void main(String[] args) {

    }
}
