package programming;

public class linkedlistintersection {
	NODE head1, head2;
	
	static class NODE{
		int data;
		NODE next;
		NODE(int value){
			data=value;
			next=null;
		}
	}
	
	int getIntersection(NODE node1, NODE node2, int diff_count) {
		NODE curr1=node1;
		NODE curr2=node2;
		
		for(int i=0;i<diff_count;i++) {
			if(curr1==null)
				return -1;
			curr1=curr1.next;
		}
		
		while(curr1!=null && curr2!=null) {
			if(curr1.data==curr2.data) {
				return curr1.data;
			}
			curr1=curr1.next;
			curr2=curr2.next;
		}
		
		return -1;
		
	}
	
	void getCount(NODE head1, NODE head2) {
		
		NODE curr1=head1;
		NODE curr2=head2;
		int result=0;
		
		int count1=0;
		int count2=0;
		
		while(curr1!=null) {
			curr1=curr1.next;
			count1++;
		}
		
		while(curr2!=null) {
			curr2=curr2.next;
			count2++;
		}
		
		//System.out.println(count1);
		//System.out.print(count2);
		
		int diff_count=Math.abs(count1-count2);
		
		if(count1>count2) {
			result=getIntersection(head1,head2, diff_count);
			if(result!=-1)
				System.out.println("Two lists intersect at:"+result);
		}
		else if(count2>count1){
			result=getIntersection(head2,head1, diff_count);
			if(result!=-1)
				System.out.println("Two lists intersect at:"+result);
		}
		
		else
			System.out.println("Two lists intersect do not intersect");
		
	}
	
	public static void main(String[] args) {
		LinkedListIntersection list=new LinkedListIntersection();
		
		list.head1=new NODE(3);
		list.head1.next=new NODE(6);
		list.head1.next.next=new NODE(9);
		list.head1.next.next.next=new NODE(15);
		list.head1.next.next.next.next=new NODE(30);
		
		list.head2=new NODE(10);
		list.head2.next=new NODE(15);
		list.head2.next.next=new NODE(30);
		
		list.getCount(list.head1, list.head2);
	}

}
