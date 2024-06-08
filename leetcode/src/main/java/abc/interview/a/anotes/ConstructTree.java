package abc.interview.a.anotes;

//Java program to construct a tree using inorder and preorder traversal
//https://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/
import java.util.*;

public class ConstructTree {
   int val;
   ConstructTree left;
   ConstructTree right;
   ConstructTree(int x) { val = x; }
}

class BinaryTree 
{
 static Set<ConstructTree> set = new HashSet<>();
 static Stack<ConstructTree> stack = new Stack<>();
  
 // Function to build tree using given traversal
 public ConstructTree buildTree(int[] preorder, int[] inorder) {
      
     ConstructTree root = null;
     for(int pre = 0, in = 0; pre < preorder.length;) {
          
         ConstructTree node = null;
         do {
             node = new ConstructTree(preorder[pre]);
             if(root == null) {
                 root = node;
             }
             if(!stack.isEmpty()) {
                 if(set.contains(stack.peek())) {
                     set.remove(stack.peek());
                     stack.pop().right = node;
                 } else {
                     stack.peek().left = node;
                 }
             }
             stack.push(node);
         } while(preorder[pre++] != inorder[in] && pre < preorder.length);
          
         node = null;
         while(!stack.isEmpty() && in < inorder.length && stack.peek().val == inorder[in]) {
             node = stack.pop();
             in++;
         }
          
         if(node != null) {
             set.add(node);
             stack.push(node);
              
         }
          
     }
      
     return root;
      
 }
  
 // Function to print tree in Inorder
 void printInorder(ConstructTree node) 
 {
     if (node == null)
         return;

     /* first recur on left child */
     printInorder(node.left);

     /* then print the data of node */
     System.out.print(node.val + " ");
      

     /* now recur on right child */
     printInorder(node.right);
 }

 // driver program to test above functions
 public static void main(String args[]) 
 {
     BinaryTree tree = new BinaryTree();
      
     int in[] = new int[]{9, 8, 4, 2, 10, 5, 10, 1, 6, 3, 13, 12, 7};
     int pre[] = new int[]{1, 2, 4, 8, 9, 5, 10, 10, 3, 6, 7, 12, 13};
     int len = in.length;
      
     ConstructTree root = tree.buildTree(pre, in);

     tree.printInorder(root);
 }
}