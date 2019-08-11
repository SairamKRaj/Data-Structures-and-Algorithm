package programming;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;


class Node3{
	int data;
	Node3 left,right;
	Node3(int val){
		data=val;
		left=right=null;
	}
}


public class reverselevelordertraversal {
	Node3 root;
	
	public static List<Integer> reverselevelordertraversal(Node3 root){
		List<Integer> result=new ArrayList<Integer>();
		Queue<Node3> queue=new LinkedList<Node3>();
		Stack<Node3> stack=new Stack<Node3>();
		
		if(root==null) {
			return result;
		}
		
		queue.add(root);
		while(!queue.isEmpty()) {
			Node3 temp=queue.poll();
			stack.push(temp);
			
			if(temp.right!=null) {
				queue.add(temp.right);
			}
			
			if(temp.left!=null) {
				queue.add(temp.left);
			}
		}
		
		while(!stack.isEmpty()) {
			result.add(stack.peek().data);
			stack.pop();
		}
		
		return result;
	}

	public static void main(String[] args) {
		reverselevelordertraversal tree=new reverselevelordertraversal();
		tree.root=new Node3(1);
		tree.root.left=new Node3(2);
		tree.root.right=new Node3(3);
		tree.root.left.left=new Node3(4);
		tree.root.left.right=new Node3(5);
		tree.root.right.left=new Node3(6);
		tree.root.right.right=new Node3(7);
		System.out.println("Reverse Level-Order traversal of the tree is:");
		System.out.print(reverselevelordertraversal(tree.root));
		

	}

}
