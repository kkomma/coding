package aaa.aa.misc;

public class DeepestLeavesSum {

	public int deepestLeavesSum(TreeNode root) {
        int[] pair = new int[2];
        helper(root, pair, 0);
        return pair[0];
    }
	
    private void helper(TreeNode curr, int[] p, int h){
        if(curr == null) return;
        if(curr.left == null && curr.right == null){
            if(p[1] < h+1){
                p[0] = curr.val;
                p[1] = h+1;
            }else if(p[1] == h+1){
                p[0] += curr.val;
                p[1] = h+1;
            }
        }
        helper(curr.left, p, h+1);
        helper(curr.right, p, h+1);
    }
    
    
	public static void main(String[] args) {
		//int[] a = {1,2,3,4,5,null,6,7,null,null,null,null,8};
		
	}

}
