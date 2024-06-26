package abc.questions.virendra;
 
/**
 * <b>IDeserve <br>
 * <a href="https://www.youtube.com/c/IDeserve">https://www.youtube.com/c/IDeserve</a>
 * <br><br>
 * Create a balanced Binary Search Tree (BST) from a sorted array</b><br>
 * Given a sorted integer array of length n, create a balanced Binary Search Tree using the values of the array. <br><br>
 * <br><br>
 * <a href="https://www.youtube.com/watch?v=VCTP81Ij-EM">Sorted array to balanced bst - Youtube Link</a> 
 * @author Saurabh
 *
 */
public class SortedArrayToBalancedBST {
 
    public static void main(String[] args) {
        int array[] = { 3, 6, 8, 23, 48, 54, 76, 89 };
        TreeNode treeRoot = createBST(array);
        inorder(treeRoot);
    
    }
     
    public static TreeNode createBST(int array[]) {
 
        return createBST(array, 0, array.length-1);
    }
 
    private static TreeNode createBST(int[] array, int start, int end) {
         
        if(array == null || array.length == 0 || start > end) {
            return null;
        }
         
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(array[mid]);
         
        root.setLeft(createBST(array, start, mid-1));
        root.setRight(createBST(array, mid+1, end));
         
        return root;
    }
     
    public static void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
         
        inorder(root.getLeft());
        System.out.print(root.getData() + "  ");
        inorder(root.getRight());
    }
}
 
class TreeNode {
 
 
    private int data;
    private TreeNode left;
    private TreeNode right;
     
    public int getData() {
        return data;
    }
 
    public void setData(int data) {
        this.data = data;
    }
 
    public TreeNode getLeft() {
        return left;
    }
 
    public void setLeft(TreeNode left) {
        this.left = left;
    }
 
    public TreeNode getRight() {
        return right;
    }
 
    public void setRight(TreeNode right) {
        this.right = right;
    }
 
    public TreeNode(int data) {
        super();
        this.data = data;
    }
    
}