import java.util.*;
/**
 * Given an n-ary tree, return the level order traversal of its nodes' values.
 * (ie, from left to right, level by level).
 * 
 * For example, given a 3-ary tree:
 * https://leetcode.com/static/images/problemset/NaryTreeExample.png
 * 
 * We should return its level order traversal:
 * 
 * [
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 * 
 * Note:
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */


// Definition for a Node.
class Node3 {
    public int val;
    public List<Node3> children;

    public Node3() {}

    public Node3(int _val,List<Node3> _children) {
        val = _val;
        children = _children;
    }
};

public class NaryTreeLevelOrderTraversal429 {
    public List<List<Integer>> levelOrder(Node3 root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node3> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i=0; i<size; i++) {
                Node3 curr = q.poll();
                level.add(curr.val);
                for (Node3 n: curr.children) {
                    q.add(n);
                }
            }
            res.add(level);
        }
        
        return res;
    }

}
