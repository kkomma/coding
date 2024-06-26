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
//863_All_Nodes_Distance_K_in_Binary_Tree.java

public class All_Nodes_Distance_K_in_Binary_Tree {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        Map<TreeNode, TreeNode> hm = buildParentMap(root);
        Set<TreeNode> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.add(target);

        while (K > 0) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode t = q.poll();

                if (t.left != null && visited.add(t.left)) {
                    q.offer(t.left);
                }
                if (t.right != null && visited.add(t.right)) {
                    q.offer(t.right);
                }

                if (hm.get(t) != null && visited.add(hm.get(t))) {
                    q.offer(hm.get(t));
                }
            }

            --K;
        }

        for (TreeNode t : q) {
            result.add(t.val);
        }

        return result;
    }

    private Map<TreeNode, TreeNode> buildParentMap(TreeNode root) {
        Map<TreeNode, TreeNode> hm = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode t = q.poll();

            if (t.left != null) {
                hm.put(t.left, t);
                q.offer(t.left);
            }

            if (t.right != null) {
                hm.put(t.right, t);
                q.offer(t.right);
            }
        }

        return hm;
    }
    public static void main(String[] args) {

    }
}
