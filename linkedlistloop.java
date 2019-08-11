package programming;

public class linkedlistloop {
	NODE head;
	
	class NODE{
		int data;
		NODE next;
		NODE(int value){
			data=value;
			next=null;
		}
	}
	
	boolean detectloop(NODE head) {
		NODE fast=head;
		NODE slow=head;
		while(slow!=null&&fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		
		if(fast==slow) {
			System.out.println(slow.data);
			removeloop(slow,head);
			return true;
			}		
		}
		
		return false;
	}
	
	void removeloop(NODE slow,NODE head){
		NODE p1=slow;
		NODE p2=slow;
		int count=1;
		while(p2.next!=p1) {
			count++;
			p2=p2.next;
		}
		
		System.out.println("Number of nodes in the loop is:"+count);
		
		p1=head;
		p2=head;
		for(int i=0;i<count;i++) {
			p2=p2.next;
		}
		
		
		while(p2!=p1) {
			p1=p1.next;
			p2=p2.next;
		}
		
		p2=p2.next;
		while(p2.next!=p1) {
			p2=p2.next;
		}
		p2.next=null;
		System.out.println("Loop successfully removed from the list");
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
		newnode.next=null;
	}

	public static void main(String[] args) {
		LinkedListLoop list=new LinkedListLoop();
		
		int[] arr= {50,20,15,4,10};
		for(int i=0;i<arr.length;i++)
			list.push(arr[i]);
		list.head.next.next.next=list.head.next;
		if(list.detectloop(list.head)) {
			System.out.println("Loop exists");
		}
		else {
			System.out.println("Loop does not exist");
		}
	}

}
