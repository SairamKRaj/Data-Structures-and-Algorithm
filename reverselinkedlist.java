package programming;

public class reverselinkedlist {
	NODE head;
	
	class NODE{
		int data;
		NODE next;
		NODE(int value){
			data=value;
			next=null;
		}
	}
	
	NODE reverse(NODE node) {
		NODE curr=node;
		NODE next;
		NODE prev=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
	}
	
	void push(int data) {
		NODE newnode=new NODE(data);
		
		if(head==null) {
			head=newnode;
			return;
		}
		
		NODE last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newnode;
	}
	
	void printlist(NODE ptr) {
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list=new ReverseLinkedList();
		int[] arr= {1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			list.push(arr[i]);
		}
		
		list.printlist(list.head);
		list.reverse(list.head);
		System.out.print("Reversed Linked List is:");
		list.printlist(list.head);
	}
}
