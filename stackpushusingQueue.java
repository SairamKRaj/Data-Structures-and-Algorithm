package programming;

import java.util.Queue;
import java.util.LinkedList;

class stack{
	
	static int cur_size;
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	
	stack(){
		cur_size=0;
	}
	
	void push(int element) {
		q2.add(element);
		cur_size++;
		
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		Queue<Integer>q=q1;
		q1=q2;
		q2=q;
	}
	
	void pop() {
		if(q1.isEmpty())
			return;
		else {
			q1.remove();
			cur_size--;
			}
		}
		
	
		int top() {
			if(q1.isEmpty())
				return -1;
			else
				return (q1.peek());
		}
		
		int size() {
			return cur_size;
		}
}

public class stackpushusingQueue {

	public static void main(String[] args) {
		stack s = new stack();  
	    s.push(1);  
	    s.push(2);  
	    s.push(3);  
	  
	    System.out.println("current size: " + s.size());  
	    System.out.println(s.top());  
	    s.pop();  
	    System.out.println(s.top());  
	    s.pop();  
	    System.out.println(s.top());  
	  
	    System.out.println("current size: " + s.size());
	}
}
