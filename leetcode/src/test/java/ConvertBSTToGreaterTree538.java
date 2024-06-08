import java.util.*;
/**
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that
 * every key of the original BST is changed to the original key plus sum of
 * all keys greater than the original key in BST.
 * 
 * Example:
 * 
 * Input: The root of a Binary Search Tree like this:
 *               5
 *             /   \
 *            2     13
 * 
 * Output: The root of a Greater Tree like this:
 *              18
 *             /   \
 *           20     13
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

public class ConvertBSTToGreaterTree538 {
    public TreeNode3 convertBST(TreeNode3 root) {
        return convertBST(root, new int[1]);
    }

    private TreeNode3 convertBST(TreeNode3 root, int[] sum) {
        if (root == null) return null;
        convertBST(root.right, sum);
        sum[0] += root.val;
        root.val = sum[0];
        convertBST(root.left, sum);
        return root;
    }


    public TreeNode3 convertBST2(TreeNode3 root) {
        if (root == null) return null;
        TreeNode3 curr = root;
        Stack<TreeNode3> stack = new Stack<>();
        int sum = 0;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.right;
            }
            
            curr = stack.pop();
            sum += curr.val;
            curr.val = sum;
            curr = curr.left;
        }
        return root;
    }

}
