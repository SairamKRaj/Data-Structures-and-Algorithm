package programming;

public class bubbleswapAlgorithm {
	
	static void left_rotate(int[] arr, int n, int d) {
		if(d==0||d==n) {
			return;
		}
		
		if(n-d==d) {
			swap(arr,0,n-d,d);
			return;
		}
		if(d<n) {
			swap(arr, 0, n-d, d);
			left_rotate(arr, n-d, d);
		}
		
		else {
			swap(arr, 0, d, n-d);
			left_rotate(arr, d, 2*d-n);
		}
	}
	
	static void swap(int[] arr, int si, int fi, int d) {
		int temp;
		for(int i=0; i<d; i++) {
			temp=arr[si];
			arr[si]=arr[fi];
			arr[fi]=temp;
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		int d=2;
		left_rotate(arr,n,d);
		System.out.println("Left Rotated array is:");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]);

	}

}
