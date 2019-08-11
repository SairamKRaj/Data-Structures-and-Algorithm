package programming;

import java.util.Stack; 

class TreeNode{
	int data;
	TreeNode left,right;
	TreeNode(int value){
		data=value;
		left=right=null;
	}
}


public class postordertraversal {
	
	TreeNode root;
	
	private void postOrderIterative(TreeNode root) { 
        Stack<TreeNode> stack = new Stack<>(); 
        while(true) { 
            while(root != null) { 
                stack.push(root); 
                stack.push(root);
                root = root.left; 
            } 
              
            // Check for empty stack 
            if(stack.empty()) return; 
            root = stack.pop();
              
            if(!stack.empty() && stack.peek() == root) root = root.right; 
              
            else { 
                  
                System.out.print(root.data);root = null; 
            } 
        } 
    } 

	public static void main(String[] args) {
		Postordertraversal tree = new Postordertraversal(); 
        
        // Let us create trees shown in above diagram 
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
        tree.root.right.left = new TreeNode(6); 
        tree.root.right.right = new TreeNode(7); 
        System.out.println("Post order traversal of binary tree is :"); 
        tree.postOrderIterative(tree.root); 
	}

}
