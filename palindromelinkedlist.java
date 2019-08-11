package programming;

class palindromelinkedlist {
		NODE head,slow,fast,second_half;
		
		class NODE{
			int data;
			NODE next;
			NODE(int value){
				data=value;
				next=null;
			}
		}
		
		
		boolean isPalindrome(NODE head) {
			slow=head;fast=head;
			NODE previous_of_slow=head;
			boolean result=true;
			NODE midnode=null;
			if(head!=null && head.next!=null) {
				while(fast!=null && fast.next!=null) {
					fast=fast.next.next;
					previous_of_slow=slow;
					slow=slow.next;
				}
				
				
				
				if(fast!=null) {
					midnode=slow;
					slow=slow.next;
				}
				
				second_half=slow;
				previous_of_slow.next=null;
				
				reverse();
				
				result=comparelist(head,second_half);
				
				reverse();
				
				if(midnode!=null) {
					previous_of_slow.next=midnode;
					midnode.next=second_half;
				}
				else {
					previous_of_slow.next=second_half;
				}
			}
			return result;
		}
		
		void reverse() {
			NODE curr=second_half;
			NODE prev=null;
			NODE next;
			
			while(curr!=null) {
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			second_half=prev;
		}
		
		boolean comparelist(NODE head1,NODE head2) {
			NODE curr1=head1;
			NODE curr2=head2;
			
			while(curr1!=null && curr2!=null) {
				if(curr1.data==curr2.data) {
					curr1=curr1.next;
					curr2=curr2.next;
				}
				else
					return false;
			}
			
			if(curr1==null && curr2==null) {
				return true;
			}
			
			return false;
		}
		
		void printlist(NODE ptr) {
			while(ptr!=null) {
				System.out.print(ptr.data+"->");
				ptr=ptr.next;
			}
			System.out.println("NULL");	
		}
		
		public void push(int data) {
			
			NODE newnode=new NODE(data);
			newnode.next=head;
			head=newnode;
		}

	public static void main(String[] args) {
		
		PalindromeLinkedList list=new PalindromeLinkedList();
		int[] arr= {1,2,2,1};
		for(int i=0;i<arr.length;i++) {
			list.push(arr[i]);
			list.printlist(list.head);
			if(list.isPalindrome(list.head)!=false) {
				System.out.println("Given linkedlist is palindrome");
			}
			else {
				System.out.println("Given linkedlist is not a palindrome");
			}
		}
	}
}
