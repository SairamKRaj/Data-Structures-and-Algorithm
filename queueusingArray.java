package programming;


class queue{
	static int front,rear,size,capacity;
	static int[] arr;
	
	Queue(int qty){
		arr=new int[qty];
		front=size=0;
		rear=capacity-1;
		capacity=qty;
	}
	
	boolean isEmpty() {
		return (size==0);
	}
	
	boolean  isFull() {
		return(size==capacity);
	}
	
	boolean Enqueue(int item) {
		if(size==capacity) {
			System.out.println("Queue Overflow");
			return false;
		}
		else {
			rear=(rear+1)%capacity;
			arr[rear]=item;
			size++;
			return true;
		}
	}
	
	int Dequeue() {
		if(size==0) {
			System.out.println("Queue Underflow");
			return -1;
		}
		else {
			int item=arr[front];
			front=(front+1)%capacity;
			size--;
			return item;
		}
	}
	
	int Front() {
		if(size==0) {
			System.out.println("Queue Underflow");
			return -1;
		}
		else {
			return arr[front];
		}
	}
	
	int Rear() {
		if(size==0) {
			System.out.println("Queue Underflow");
			return -1;
		}
		else {
			return arr[rear];
		}
	}
	
	void Display() {
		if(size==0) {
			System.out.println("Queue Underflow");
		}
		else {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
		}
	}
}


public class queueusingArray {

	public static void main(String[] args) {
		Queue q = new Queue(1000); 
        
        q.Enqueue(10); 
        q.Enqueue(20); 
        q.Enqueue(30); 
        q.Enqueue(40); 
        
        System.out.println(q.Dequeue() +  
                     " dequeued from queue\n"); 
        
        System.out.println("Front item is " +  
                               q.Front()); 
           
        System.out.println("Rear item is " +  
                                q.Rear()); 
    } 
} 
