import java.util.*;
/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 * Example:
 * 
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * Output: [1,2,3]
 * 
 * Follow up: Recursive solution is trivial, could you do it iteratively?
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

public class BinaryTreePreorderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode3 root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode3 root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }


    public List<Integer> preorderTraversal2(TreeNode3 root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode3> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode3 curr = stack.pop();
            res.add(curr.val);
            if (curr.right != null) stack.add(curr.right);
            if (curr.left != null) stack.add(curr.left);
        }
        return res;
    }

}
