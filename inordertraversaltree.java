package programming;
import java.util.*;

class NODE{
	int data;
	NODE left,right;
	NODE(int value){
		data=value;
		left=right=null;
	}
}

class BinaryTree{
	NODE root;
}


public class inordertraversaltree {
	
	public static List<Integer> inordertraversal(NODE root){
		List<Integer> result=new ArrayList<Integer>();
		NODE curr=root;
		NODE prev;
		while(curr!=null) {
			if(curr.left!=null) {
				prev=curr.left;
				while(prev.right!=null) {
					prev=prev.right;
				}
				prev.right=curr;
				NODE temp=curr;
				curr=curr.left;
				temp.left=null;
			}
			else {
				result.add(curr.data);
				curr=curr.right;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.root=new NODE(1);
		tree.root.left=new NODE(2);
		tree.root.right=new NODE(3);
		tree.root.left.left=new NODE(4);
		tree.root.left.right=new NODE(5);
		tree.root.right.left=new NODE(6);
		System.out.println("Inorder Traversal of the tree is:");
		List<Integer> result=inordertraversal(tree.root);
		for(int i=0;i<result.size();i++) {
			System.out.print(result.get(i)+" ");
		}
		
	}

}
