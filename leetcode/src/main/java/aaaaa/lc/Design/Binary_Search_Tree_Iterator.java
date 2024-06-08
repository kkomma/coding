package aaaaa.lc.Design;

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
//173_Binary_Search_Tree_Iterator.java

public class Binary_Search_Tree_Iterator {
    private Stack<TreeNode> s;

    public Binary_Search_Tree_Iterator(TreeNode root) {
        s = new Stack<>();
        pushAllLeftNodes(root);
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode top = s.pop();
        pushAllLeftNodes(top.right);
        return top.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }

    private void pushAllLeftNodes(TreeNode root) {
        while (root != null) {
            s.push(root);
            root = root.left;
        }
    }
    public static void main(String[] args) {

    }
}
