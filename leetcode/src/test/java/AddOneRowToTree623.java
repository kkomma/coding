import java.util.*;
/**
 * Given the root of a binary tree, then value v and depth d, you need to add a
 * row of nodes with value v at the given depth d. The root node is at depth 1.
 *
 * The adding rule is: given a positive integer depth d, for each NOT null tree
 * nodes N in depth d-1, create two tree nodes with value v as N's left subtree
 * root and right subtree root. And N's original left subtree should be the left
 * subtree of the new left subtree root, its original right subtree should be
 * the right subtree of the new right subtree root. If depth d is 1 that means
 * there is no depth d-1 at all, then create a tree node with value v as the
 * new root of the whole original tree, and the original tree is the new root's
 * left subtree.
 *
 * Example 1:
 * Input:
 * A binary tree as following:
 *        4
 *      /   \
 *     2     6
 *    / \   /
 *   3   1 5
 *
 * v = 1
 *
 * d = 2
 *
 * Output:
 *        4
 *       / \
 *      1   1
 *     /     \
 *    2       6
 *   / \     /
 *  3   1   5
 *
 * ---------------------------------------------------
 *
 * Example 2:
 * Input:
 * A binary tree as following:
 *       4
 *      /
 *     2
 *    / \
 *   3   1
 *
 * v = 1
 *
 * d = 3
 *
 * Output:
 *       4
 *      /
 *     2
 *    / \
 *   1   1
 *  /     \
 * 3       1
 *
 *
 * Note:
 * The given d is in range [1, maximum depth of the given tree + 1].
 * The given binary tree has at least one tree node.
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


public class AddOneRowToTree623 {
    public TreeNode3 addOneRow(TreeNode3 root, int v, int d) {
        if (d == 1) {
            TreeNode3 newNode = new TreeNode3(v);
            newNode.left = root;
            return newNode;
        }

        insert(root, v, d);

        return root;
    }

    private void insert(TreeNode3 root, int v, int d) {
        if (root == null) {
            return;
        }
        if (d == 2) {
            TreeNode3 t = root.left;
            root.left = new TreeNode3(v);
            root.left.left = t;
            t = root.right;
            root.right = new TreeNode3(v);
            root.right.right = t;
        } else {
            addOneRow(root.left, v, d-1);
            addOneRow(root.right, v, d-1);
        }
    }

    /**
     * https://discuss.leetcode.com/topic/92964/java-three-methods-one-bfs-and-two-dfs
     */
    public TreeNode3 addOneRow3(TreeNode3 root, int v, int d) {
        if (d == 1) {
            TreeNode3 newroot = new TreeNode3(v);
            newroot.left = root;
            return newroot;
        }
        LinkedList<TreeNode3> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 0; i < d-2; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                TreeNode3 t = queue.poll();
                if (t.left != null) queue.add(t.left);
                if (t.right != null) queue.add(t.right);
            }
        }
        while (!queue.isEmpty()) {
            TreeNode3 t = queue.poll();
            TreeNode3 tmp = t.left;
            t.left = new TreeNode3(v);
            t.left.left = tmp;
            tmp = t.right;
            t.right = new TreeNode3(v);
            t.right.right = tmp;
        }
        return root;
    }




}
