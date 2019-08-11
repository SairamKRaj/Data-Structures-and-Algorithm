package programming;

import java.util.Stack;

public class previousSmallElement {
	
	void previous_small_Element(int[] arr, int n) {
		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=0; i<n; i++) {
			
			while(!s.isEmpty() && s.peek()>=arr[i]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				System.out.print("_,");
			}
			else {
				System.out.print(s.peek()+",");
			}
			
			s.push(arr[i]);
		}
	}

	public static void main(String[] args) {
		previousSmallElement obj = new previousSmallElement();
		int arr[] = new int[]{1,6,4,10,2,5};
		int n=arr.length;
		obj.previous_small_Element(arr, n);

	}

}
