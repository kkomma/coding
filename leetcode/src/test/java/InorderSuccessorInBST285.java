import java.util.*;
/**
 * Given a binary search tree and a node in it, find the in-order successor of
 * that node in the BST.
 *
 * Note: If the given node has no in-order successor in the tree, return null.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode1 {
 *     int val;
 *     TreeNode1 left;
 *     TreeNode1 right;
 *     TreeNode1(int x) { val = x; }
 * }
 */

class TreeNode1 {
	      int val;
	      TreeNode1 left;
	      TreeNode1 right;
	      TreeNode1(int x) { val = x; }
}

public class InorderSuccessorInBST285 {
    // Iteratively
    public TreeNode1 inorderSuccessor(TreeNode1 root, TreeNode1 p) {
        if (p.right != null)
            return findMin(p.right);

        TreeNode1 succ = null;
        while (root != null) {
            if (root.val == p.val) break;
            if (root.val > p.val) {
                succ = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return succ;
    }

    private TreeNode1 findMin(TreeNode1 n) {
        if (n == null) return null;
        TreeNode1 t = n;
        while (t.left != null) t = t.left;
        return t;
    }


    // Recursively
    public TreeNode1 inorderSuccessor2(TreeNode1 root, TreeNode1 x) {
        if (x.right != null)
            return findMin(x.right);
        return inorderSuccessor2(root, x, null);
    }

    public TreeNode1 inorderSuccessor2(TreeNode1 root, TreeNode1 x, TreeNode1 succ) {
        if (root == null || x == null || root.val == x.val) return succ;
        if (root.val > x.val) {
            return inorderSuccessor2(root.left, x, root);
        } else {
            return inorderSuccessor2(root.right, x, succ);
        }
    }


    public TreeNode1 inorderSuccessor3(TreeNode1 root, TreeNode1 p) {
        return inorderSuccessor3(root, p, null);
    }

    public TreeNode1 inorderSuccessor3(TreeNode1 root, TreeNode1 p, TreeNode1 pre) {
        if (root.val == p.val) {
            if (root.right == null) {
                return pre;
            } else {
                return findMin(root.right);
            }
        } else if (root.val > p.val) {
            return inorderSuccessor3(root.left, p, root);
        } else {
            return inorderSuccessor3(root.right, p, pre);
        }
    }


    /**
     * https://leetcode.com/problems/inorder-successor-in-bst/discuss/72653/Share-my-Java-recursive-solution
     */
    public TreeNode1 inorderSuccessor4(TreeNode1 root, TreeNode1 p) {
        if (root == null)
            return null;
        if (root.val <= p.val) {
            return inorderSuccessor4(root.right, p);
        } else {
            TreeNode1 left = inorderSuccessor4(root.left, p);
            return (left != null) ? left : root;
        }
    }

}
