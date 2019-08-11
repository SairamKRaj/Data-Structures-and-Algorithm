package programming;

import java.util.Queue;
import java.util.LinkedList;

class stacks{
	static int cur_size;
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	
	stacks(){
		cur_size=0;
	}
	
	void push(int element) {
			q1.add(element);
			cur_size++;
	}
	
	void pop() {
		while(q1.size()!=1){
			q2.add(q1.peek());
			q1.remove();
		}
		
		q1.remove();
		cur_size--;
		
		Queue<Integer> q=q1;
		q1=q2;
		q2=q;
	}
	
	int top() {
		while(q1.size()!=1){
			q2.add(q1.peek());
			q1.remove();
		}
		
		int temp=q1.peek();
		q2.add(q1.peek());
		q1.remove();
		
		Queue<Integer> q=q1;
		q1=q2;
		q2=q;
		
		return temp;
	}
	
	int size() {
		return cur_size;
	}
}


public class stackusingQueuePop {

	public static void main(String[] args) {
		stacks s = new stacks();  
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
