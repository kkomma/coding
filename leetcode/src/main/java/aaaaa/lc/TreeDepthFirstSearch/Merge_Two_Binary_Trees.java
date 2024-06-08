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
//617_Merge_Two_Binary_Trees.java

public class Merge_Two_Binary_Trees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        int sum = 0;

        if (t1 != null) {
            sum += t1.val;
        }

        if (t2 != null) {
            sum += t2.val;
        }

        TreeNode tn = new TreeNode(sum);
        tn.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        tn.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

        return tn;
    }
    public static void main(String[] args) {

    }
}
