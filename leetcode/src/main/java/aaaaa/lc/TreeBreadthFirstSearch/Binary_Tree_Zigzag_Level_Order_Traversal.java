package aaaaa.lc.TreeBreadthFirstSearch;

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
//103_Binary_Tree_Zigzag_Level_Order_Traversal.java

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int level = q.size();

            for (int i = 0; i < level; i++) {
                TreeNode t = q.poll();

                if (!leftToRight) {
                    temp.add(0, t.val);
                } else {
                    temp.add(t.val);
                }

                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }

            leftToRight = !leftToRight;
            result.add(temp);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
