package programming;

import java.util.Stack;


class queues{
	//int cur_size;
	static Stack<Integer> s1=new Stack<Integer>();
	static Stack<Integer> s2=new Stack<Integer>();
	
	/*queue(){
		cur_size=0;
	}*/
	
	void Enqueue(int element) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(element);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	int Dequeue() {
		if(s1.isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		else {
			int x=s1.peek();
			s1.pop();
			return x;
		}
	}
}

public class queueusingStackPush {

	public static void main(String[] args) {
		queues q = new queues();  
	    q.Enqueue(1);  
	    q.Enqueue(2);  
	    q.Enqueue(3);  
	  
	    System.out.println(q.Dequeue());  
	    System.out.println(q.Dequeue()); 
	    System.out.println(q.Dequeue()); 

	}
}
