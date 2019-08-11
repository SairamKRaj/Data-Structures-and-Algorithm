package programming;

import java.util.Stack;

class ques{
	
	static Stack<Integer> s1=new Stack<Integer>();
	static Stack<Integer> s2=new Stack<Integer>();
	
	void Enqueue(int element) {
		s1.push(element);
	}
	
	int Dequeque() {
		
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.print("Queue is Empty");
			System.exit(0);
		}
		
		if(s2.isEmpty()) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		}
		int element=s2.pop();
		return element;
	}
}

public class queueusingStackforDequeue {

	public static void main(String[] args) {
		ques q = new ques(); 
        q.Enqueue(1); 
        q.Enqueue(2); 
        q.Enqueue(3); 
  
        /* Dequeue items */
        System.out.print(q.Dequeque() + " "); 
        System.out.print(q.Dequeque() + " "); 
        System.out.println(q.Dequeque() + " "); 
		

	}

}
