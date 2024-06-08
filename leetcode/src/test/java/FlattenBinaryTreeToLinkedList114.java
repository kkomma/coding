import java.util.*;
/**
 * Given a binary tree, flatten it to a linked list in-place.
 *
 * For example,
 * Given
 *         1
 *        / \
 *       2   5
 *      / \   \
 *    3   4   6
 *
 * The flattened tree should look like:
 *  1
 *   \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
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

public class FlattenBinaryTreeToLinkedList114 {
    public void flatten(TreeNode3 root) {
        flattenNode(root);
    }

    private TreeNode3 flattenNode(TreeNode3 root) {
        if (root == null) return null;
        TreeNode3 left = root.left;
        TreeNode3 right = root.right;

        root.left = null;

        if (left == null && right == null) {
            return root;
        } else if (left == null && right != null) {
            TreeNode3 rightEnd = flattenNode(right);
            return rightEnd;
        } else if (left != null && right == null) {
            TreeNode3 leftEnd = flattenNode(left);
            root.right = left;
            return leftEnd;
        } else {
            TreeNode3 leftEnd = flattenNode(left);
            TreeNode3 rightEnd = flattenNode(right);
            leftEnd.right = right;
            root.right = left;
            return rightEnd;
        }
    }

    public void flatten2(TreeNode3 root) {
        helper(root);
    }

    private TreeNode3 helper(TreeNode3 root) {
        if (root == null || (root.left == null && root.right == null)) return root;

        TreeNode3 leftLast = helper(root.left);

        if (leftLast != null) {
            leftLast.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return helper(root.right);
    }


    /**
     * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/discuss/37010/Share-my-simple-NON-recursive-solution-O(1)-space-complexity!
     */
    public void flatten3(TreeNode3 root) {
    	TreeNode3 cur = root;
    	while (cur != null) {
    		if (cur.left != null) {
    			TreeNode3 last = cur.left;
    			while (last.right != null) last = last.right;
    			last.right = cur.right;
    			cur.right = cur.left;
    			cur.left = null;
    		}
    		cur = cur.right;
    	}
    }


    /**
     * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/discuss/36977/My-short-post-order-traversal-Java-solution-for-share
     */
    public void flatten4(TreeNode3 root) {
        flatten(root,null);
    }

    private TreeNode3 flatten(TreeNode3 root, TreeNode3 pre) {
        if(root==null) return pre;
        pre=flatten(root.right,pre);
        pre=flatten(root.left,pre);
        root.right=pre;
        root.left=null;
        pre=root;
        return pre;
    }


    public static void main(String[] args) {
        FlattenBinaryTreeToLinkedList114 fbt2ll = new FlattenBinaryTreeToLinkedList114();

        TreeNode3 n1 = new TreeNode3(1);
        TreeNode3 n2 = new TreeNode3(2);
        TreeNode3 n3 = new TreeNode3(3);
        TreeNode3 n4 = new TreeNode3(4);
        TreeNode3 n5 = new TreeNode3(5);
        TreeNode3 n6 = new TreeNode3(6);

        n1.left = n2;
        n1.right = n5;
        n2.left = n3;
        n2.right = n4;
        n5.right = n6;

        fbt2ll.flatten(n1);
        System.out.println("Out!");
        System.out.println(n1.val);
        System.out.println(n1.right.val);
        System.out.println(n1.right.right.val);
        System.out.println(n1.right.right.right.val);
        System.out.println(n1.right.right.right.right.val);
        System.out.println(n1.right.right.right.right.right.val);
    }

}
