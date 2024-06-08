import java.util.*;
/**
 * Invert a binary tree.
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 * to
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
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

public class InvertBinaryTree226 {
    public TreeNode3 invertTree(TreeNode3 root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode3 left = invertTree(root.right);
        TreeNode3 right = invertTree(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
}
