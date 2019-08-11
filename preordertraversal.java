package programming;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

class Node1{
	int data;
	Node1 left,right;
	Node1(int val){
		data=val;
		left=right=null;
	}
}

public class preordertraversal {
	Node1 root;
	
	public static List<Integer> preordertraversal(Node1 root){
		List<Integer> result=new ArrayList<Integer>();
		Stack<Node1> stack=new Stack<Node1>();
		if(root==null)
			return result;
		stack.push(root);
		
		while(!stack.isEmpty()) {
			Node1 curr=stack.peek();
			result.add(curr.data);
			stack.pop();
			
			if(curr.right!=null) {
				stack.push(curr.right);
			}
			
			if(curr.left!=null) {
				stack.push(curr.left);
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		Preordertraversal tree=new Preordertraversal();
		tree.root=new Node1(1);
		tree.root.left=new Node1(2);
		tree.root.right=new Node1(3);
		tree.root.left.left=new Node1(4);
		tree.root.left.right=new Node1(5);
		tree.root.right.left=new Node1(6);
		tree.root.right.right=new Node1(7);
		System.out.println("Pre-Order traversal of the tree is:");
		System.out.print(preordertraversal(tree.root));

	}

}
