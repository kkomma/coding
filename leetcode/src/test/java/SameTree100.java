import java.util.*;
/**
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical
 * and the nodes have the same value.
 *
 * Example 1:
 *
 * Input:     1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * Output: true
 *
 * Example 2:
 *
 * Input:     1         1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * Output: false
 *
 * Example 3:
 *
 * Input:     1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * Output: false
 *
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SameTree100 {
    public boolean isSameTree(TreeNode3 p, TreeNode3 q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    /**
     * https://leetcode.com/problems/same-tree/discuss/32684/My-non-recursive-method
     */
    public boolean isSameTree2(TreeNode3 p, TreeNode3 q) {
        Stack<TreeNode3> stack_p = new Stack <> ();
        Stack<TreeNode3> stack_q = new Stack <> ();
        if (p != null) stack_p.push( p ) ;
        if (q != null) stack_q.push( q ) ;
        while (!stack_p.isEmpty() && !stack_q.isEmpty()) {
          TreeNode3 pn = stack_p.pop() ;
          TreeNode3 qn = stack_q.pop() ;
          if (pn.val != qn.val) return false ;
          if (pn.right != null) stack_p.push(pn.right) ;
          if (qn.right != null) stack_q.push(qn.right) ;
          if (stack_p.size() != stack_q.size()) return false ;
          if (pn.left != null) stack_p.push(pn.left) ;
          if (qn.left != null) stack_q.push(qn.left) ;
          if (stack_p.size() != stack_q.size()) return false ;
        }
        return stack_p.size() == stack_q.size() ;
    }

}
