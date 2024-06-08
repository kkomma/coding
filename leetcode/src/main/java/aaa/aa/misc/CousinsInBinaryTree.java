package aaa.aa.misc;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
		left = null;
		right = null;
	}
}


public class CousinsInBinaryTree {
	Map<Integer, Integer> depth;
	Map<Integer, TreeNode> parent;

	public boolean isCousins(TreeNode root, int x, int y) {
		depth = new HashMap<>();
		parent = new HashMap<>();
		dfs(root, null);
		return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
	}

	public void dfs(TreeNode node, TreeNode par) {
		if (node != null) {
			depth.put(node.val, par != null ? 1 + depth.get(par.val) : 0);
			parent.put(node.val, par);
			dfs(node.left, node);
			dfs(node.right, node);
		}
	}
}


