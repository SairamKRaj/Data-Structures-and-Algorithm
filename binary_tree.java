package programming;


class Node{
	
	int value;
	Node left, right;
	public Node(int value){
		this.value=value;
		left = right = null;
	}
}


public class binary_tree {
	
	Node root;
	
	void createNode(int[] parent, int i, Node created[]) {
		
		if (created[i]!=null)
			return;
		
		created[i]=new Node(i);
		
		if(parent[i]==-1) {
			root = created[i];
			return;
		}
		
		if(created[parent[i]]==null) {
			createNode(parent, parent[i], created);
		}
		
		Node p = created[parent[i]];
		
		if(p.left==null)
			p.left=created[i];
		else
			p.right=created[i];
		
		
	}

	Node createTree(int parent[], int n) {
		Node[] created = new Node[n];
		
		for(int i=0; i<n; i++) {
			created[i]=null;
		}
		
		for(int i=0; i<n; i++) {
			createNode(parent, i, created);
		}
		
		return root;
	}
	
	void inorder_traversal(Node node) {
		if(node!=null) {
			inorder_traversal(node.left);
			System.out.print(node.value);
			inorder_traversal(node.right);
		}
	}
	
	void preorder_traversal(Node node) {
		if(node!=null) {
			System.out.print(node.value);
			preorder_traversal(node.left);
			preorder_traversal(node.right);
		}
	}
	
	void postorder_traversal(Node node) {
		if(node!=null) {
			postorder_traversal(node.left);
			postorder_traversal(node.right);
			System.out.print(node.value);
		}
	}

	
	public static void main(String[] args) {
		binary_tree obj = new binary_tree();
		int [] arr = new int[]{-1, 0, 0, 1, 1, 3, 5};
		int n = arr.length;
		Node node = obj.createTree(arr, n);
		System.out.println("Pre-Order traversal of the tree is:");
		obj.preorder_traversal(node);
		System.out.println();
		System.out.println("In-Order traversal of the tree is:");
		obj.inorder_traversal(node);
		System.out.println();
		System.out.println("Post-Order traversal of the tree is:");
		obj.postorder_traversal(node);
		System.out.println();
	}
}
