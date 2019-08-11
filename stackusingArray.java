package programming;

class Stack{
	int top;
	static final int max_size=1000;
	int[] arr=new int[1000];
	Stack(){
		top=-1;
	}
	
	boolean isEmpty() {
		return(top<0);
	}
	
	boolean push(int x) {
		if(top>=max_size-1) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			arr[++top]=x;
			System.out.println(x+"inserted into stack");
			return true;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			int x=arr[top--];
			return x;
		}
	}
	
	int peek() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			return (arr[top]);
		}
	}
}

public class stackusingArray {
	
	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		int value=s.pop();
		int value2=s.peek();
		System.out.println(value);
		System.out.println(value2);

	}

}
