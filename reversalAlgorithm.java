package programming;

public class reversalAlgorithm {
	
	static void left_rotate(int[] arr, int n, int d) {
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
	}
	
	static void reverseArray(int[] arr, int si, int fi) {
		int temp;
		for(int i=si; i<=fi; i++) {
			temp=arr[si];
			arr[si]=arr[fi];
			arr[fi]=temp;
			si++;
			fi--;
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
