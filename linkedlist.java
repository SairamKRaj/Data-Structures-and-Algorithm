package programming;

public class linkedList {
	NODE head;
	class NODE{
		int data;
		NODE next;
		NODE(int value){
			data=value;
			next=null;
		}
	}
	
	public NODE reverse(NODE node) {
		NODE curr=node;
		NODE prev=null;
		NODE next;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		head=prev;
		return head;
	}
	
	public void insert(int data) {
		NODE newnode=new NODE(data);
		
		if(head==null) {
			head=newnode;
		}
		else {
		NODE last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newnode;
		}
	}
	
	public void displaylist(NODE head) {
		NODE ptr=head;
		while(ptr!=null) {
			System.out.print(ptr.data);
			ptr=ptr.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		int[] arr= {1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			list.insert(arr[i]);
		}
		
		list.displaylist(list.head);
		list.reverse(list.head);
		System.out.print("Reversed Linked List is:");
		list.displaylist(list.head);

	}

}
