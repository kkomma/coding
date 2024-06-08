package abc.interview.ds;


//Java program to check is binary tree is symmetric or not
class BinaryTreeee 
{
	int key;
	BinaryTreeee left, right;
	BinaryTreeee(int item) 
	{
		key = item;
		left = right = null;
	}
}

public class BinaryTreeeeSym 
{
	BinaryTreeee root;

	// returns true if trees with roots as root1 and root2 are mirror
	boolean isMirror(BinaryTreeee node1, BinaryTreeee node2) 
	{
		// if both trees are empty, then they are mirror image
		if (node1 == null && node2 == null)
			return true;

		// For two trees to be mirror images, the following three
		// conditions must be true
		// 1 - Their root node's key must be same
		// 2 - left subtree of left tree and right subtree
		//      of right tree have to be mirror images
		// 3 - right subtree of left tree and left subtree
		//      of right tree have to be mirror images
		if (node1 != null && node2 != null && node1.key == node2.key)
			return (isMirror(node1.left, node2.right)
					&& isMirror(node1.right, node2.left));

		// if neither of the above conditions is true then
		// root1 and root2 are mirror images
		return false;
	}

	// returns true if the tree is symmetric i.e
	// mirror image of itself
	boolean isSymmetric(BinaryTreeee node) 
	{
		// check if tree is mirror of itself
		return isMirror(root, root);
	}

	// Driver program
	public static void main(String args[]) 
	{
		BinaryTreeeeSym tree = new BinaryTreeeeSym();
		tree.root = new BinaryTreeee(1);
		tree.root.left = new BinaryTreeee(2);
		tree.root.right = new BinaryTreeee(2);
		tree.root.left.left = new BinaryTreeee(3);
		tree.root.left.right = new BinaryTreeee(4);
		tree.root.right.left = new BinaryTreeee(4);
		tree.root.right.right = new BinaryTreeee(3);
		boolean output = tree.isSymmetric(tree.root);
		if (output == true)
			System.out.println("1");
		else
			System.out.println("0");
	}
}

//This code has been contributed by Mayank Jaiswal

