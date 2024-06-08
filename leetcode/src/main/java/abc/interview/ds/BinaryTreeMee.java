package abc.interview.ds;

import java.util.Random;

public class BinaryTreeMee {
	
	BinaryTreeMee left, right;
	int value;
	
	public BinaryTreeMee(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}


	public void addNode(int value) {
		if(this.value < value) {
			if(this.left != null) {
				this.left.addNode(value);
			}else {
				this.left = new BinaryTreeMee(value);
			}
		}else {
			if(this.right != null) {
				this.right.addNode(value);
			}else {
				this.right = new BinaryTreeMee(value);
			}
		}
	}

	
	public void preOrder() {
		System.out.println(this.value);
		if(this.left != null) {
			this.left.preOrder();
		}
		
		if(this.right != null) {
			this.right.preOrder();
		}
		
	}

		
	public static void main(String[] args) {
		BinaryTreeMee binaryTreeMee = new BinaryTreeMee(33);
		new Random().ints(10,333,999).forEach(r->{
			System.out.println("r::"+r);
			binaryTreeMee.addNode(r);
		});
		binaryTreeMee.preOrder();
	}

}
