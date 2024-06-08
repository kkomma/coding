package abc.aa.aalat;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;		
	}

	public static TreeNode constructMaximumBinaryTree(int[] nums) {
		return construct(nums, 0, nums.length);
	}
	public static TreeNode construct(int[] nums, int l, int r) {
		if (l == r)
			return null;
		int max_i = max(nums, l, r);
		TreeNode root = new TreeNode(nums[max_i]);
		root.left = construct(nums, l, max_i);
		root.right = construct(nums, max_i + 1, r);
		return root;
	}
	
	public static TreeNode constructPr(int[] nums, int l, int r) {
		if (l == r)
			return null;
		int max_i = max(nums, l, r);
		TreeNode root = new TreeNode(nums[max_i]);
		root.left = construct(nums, l, max_i);
		root.right = construct(nums, max_i + 1, r);
		return root;
	}
	
	
	public static int max(int[] nums, int l, int r) {
		int max_i = l;
		for (int i = l; i < r; i++) {
			if (nums[max_i] < nums[i]) {
				max_i = i;
			}				
		}
		return max_i;
	}

	// Visit the node first, then left and right sub-trees
	public void traversePreOrder() {
		System.out.print(" "+ this.val );
		if( this.left != null ) {
			this.left.traversePreOrder();
		}
		if( this.right != null ) {
			this.right.traversePreOrder();
		}
	}

	public static void main(String[] args) {
		int[] a = {7,8,9,11,4,10,6};
		constructMaximumBinaryTree(a).traversePreOrder();
	}


}