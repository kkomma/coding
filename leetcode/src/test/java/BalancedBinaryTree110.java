import java.util.*;
/**
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by
 * more than 1.
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


public class BalancedBinaryTree110 {

    public boolean isBalanced(TreeNode3 root) {
        if (root == null) {
            return true;
        }

        int depthL = depth(root.left);
        int depthR = depth(root.right);

        return Math.abs(depthL - depthR) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    private int depth(TreeNode3 node) {
        if (node == null) {
            return 0;
        }

        int depthL = depth(node.left);
        int depthR = depth(node.right);

        return Math.max(depthL, depthR) + 1;
    }


    /**
     * https://discuss.leetcode.com/topic/11007/java-solution-based-on-height-check-left-and-right-node-in-every-recursion-to-avoid-further-useless-search
     */
    public boolean isBalanced2(TreeNode3 root) {
        if (root == null) {
            return true;
        }
        return height(root) != -1;

    }

    public int height(TreeNode3 node){
        if (node == null) {
            return 0;
        }

        int lH = height(node.left);
        if (lH == -1) {
            return -1;
        }

        int rH = height(node.right);
        if (rH == -1) {
            return -1;
        }

        if (lH-rH < -1 || lH-rH > 1) {
            return -1;
        }

        return Math.max(lH,rH) + 1;
    }


    public static void main(String[] args) {
        BalancedBinaryTree110 bbt = new BalancedBinaryTree110();

        TreeNode3 root1 = new TreeNode3(2);
        root1.left = new TreeNode3(1);
        root1.right = new TreeNode3(3);

        TreeNode3 root3 = new TreeNode3(2);
        root3.left = new TreeNode3(1);

        TreeNode3 root2 = new TreeNode3(2);
        root2.left = root3;


        TreeNode3 n1 = new TreeNode3(1);
        TreeNode3 n2 = new TreeNode3(2);
        TreeNode3 n3 = new TreeNode3(3);
        TreeNode3 n4 = new TreeNode3(4);
        TreeNode3 n5 = new TreeNode3(5);
        TreeNode3 n6 = new TreeNode3(6);
        TreeNode3 n7 = new TreeNode3(7);
        TreeNode3 n8 = new TreeNode3(8);

        n4.left = n7;
        n2.left = n4;
        n2.right = n5;
        n1.left = n2;

        n6.right = n8;
        n3.right = n6;
        n1.right = n3;


        System.out.println("-------- 1");
        System.out.println(bbt.isBalanced(root1));
        System.out.println("-------- 2");
        System.out.println(bbt.isBalanced(root2));
        System.out.println("-------- 3");
        System.out.println(bbt.isBalanced(root3));
        System.out.println("-------- 4");
        System.out.println(bbt.isBalanced(n1));
    }
}
