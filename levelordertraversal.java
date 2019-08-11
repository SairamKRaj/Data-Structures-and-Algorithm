package programming;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class Node2{
	int data;
	Node2 left,right;
	Node2(int val){
		data=val;
		left=right=null;
	}
}

public class levelordertraversal {
	
	Node2 root;
	
	public static List<Integer> levelordertraversal(Node2 root){
		Queue<Node2> queue=new LinkedList<Node2>();
		List<Integer> result=new ArrayList<Integer>();
		if(root==null) {
			return result;
		}
		else {
			queue.add(root);
			while(!queue.isEmpty()) {
				Node2 temp=queue.poll();
				result.add(temp.data);
				if(temp.left!=null)
					queue.add(temp.left);
				if(temp.right!=null)
					queue.add(temp.right);
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Levelordertraversal tree=new Levelordertraversal();
		tree.root=new Node2(1);
		tree.root.left=new Node2(2);
		tree.root.right=new Node2(3);
		tree.root.left.left=new Node2(4);
		tree.root.left.right=new Node2(5);
		tree.root.right.left=new Node2(6);
		tree.root.right.right=new Node2(7);
		System.out.println("Level-Order traversal of the tree is:");
		System.out.println(levelordertraversal(tree.root));

	}

}
